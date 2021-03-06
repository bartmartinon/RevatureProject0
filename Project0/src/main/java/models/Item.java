package models;

/**
 *  Project 0:<br>
 * <br>
 *  The Item class serves as a representation of a real-world book found in the Library system.
 *  	Item instances hold information of its real-world counterpart as variables.
 *  This class serves as the basis for all Items as a parent class.
 *
 *  <br> <br>
 *  Created: <br>
 *     07 April 2020, Barthelemy Martinon<br>
 *     With assistance from: <br>
 *  Modifications: <br>
 *     07 April 2020, Barthelemy Martinon,    Created class.
 *     										  Implemented ID, checkedStatus, title, author, publisher, and year
 *     										    variables. All are considered common across all kinds of Items.
 *     										  Implemented getter methods, toggleCheckStatus and printBaseInfo methods.
 * <br>
 *     10 April 2020, Barthelemy Martinon,    Class renamed and refactored from Book to Item to avoid conflicts with
 *     											existing java.lang.Book class.
 *     										  Change performed following project migration from Eclipse Luna to Intellij
 * <br>
 *     16 April 2020, Barthelemy Martinon,    Added checkStatus boolean parameter for Item constructor.
 * <br>
 *  @author Barthelemy Martinon   With assistance from: 
 *  @version 16 April 2020
 */
public abstract class Item {
	//Instance Variables
	protected int ID;
	protected boolean checkStatus;    // Boolean determines if Book is considered checked in (true) or out (false)
	protected String title;
	protected String author;
	protected String publisher;
	protected int year;
	
	// Constructor
	
	public Item(int ID, boolean checkStatus, String title, String author, String publisher, int year) {
		this.ID = ID;
		this.checkStatus = checkStatus;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
	}
	
	// Getter Methods
	
	public int getID() {
		return this.ID;
	}
	
	public boolean getCheckStatus() {
		return this.checkStatus;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public int getYear() {
		return this.year;
	}
	
	// Methods

	/*
	 * Toggles the instance's checkStatus attribute from true to false or vice versa.
	 */
	public void toggleCheckStatus() {
		if ( this.getCheckStatus() == true ) {
			this.checkStatus = false;
		} else {
			this.checkStatus = true;
		}
	}
	
	public abstract void printInfo();

	/*
	 * Prints the information that is available on all Items
	 */
	public void printBaseInfo() {
		System.out.println("ID # " + this.getID());
		System.out.println("Check Status: " + this.getCheckStatus());
		System.out.println("Title: " + this.getTitle());
		System.out.println("Author: " + this.getAuthor());
		System.out.println("Publisher: " + this.getPublisher());
		System.out.println("Year: " + this.getYear());
	}
}
