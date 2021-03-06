package models;

/**
 *  Project 0:<br>
 * <br>
 *  The Dictionary class serves as a representation of a real-world dictionary found in the Library system.
 *  	Dictionary instances hold information of its real-world counterpart as variables that are unique to
 *      dictionaries.
 *  This class serves one of Item's child classes.
 *
 *  <br> <br>
 *  Created: <br>
 *     07 April 2020, Barthelemy Martinon<br>
 *     With assistance from: <br>
 *  Modifications: <br>
 *     07 April 2020, Barthelemy Martinon,    Created class.
 *     										  Implemented language and wordCount variables;
 *     										    These variables are considered to be unique to Dictionaries.
 *     											Inherits Item's variables.
 *     										  Implemented getter methods unique to Dictionary, and printInfo methods.
 * <br>
 *     16 April 2020, Barthelemy Martinon,    Added checkStatus boolean parameter for Dictionary constructor.
 * <br>
 *  @author Barthelemy Martinon   With assistance from:
 *  @version 16 April 2020
 */
public class Dictionary extends Item {
	String language;
	int wordCount;
	
	// Constructors
	
	public Dictionary(int ID, boolean checkStatus, String title, String author, String publisher, int year,
					  String language, int wordCount){
		super(ID, checkStatus, title, author, publisher, year);
		this.language = language;
		this.wordCount = wordCount;
	}
	
	// Getter Methods
	
	public String getLangauge() {
		return this.language;
	}
	
	public int getWordCount() {
		return this.wordCount;
	}

	// Methods

	/*
	 * Prints an instance's attribute information.
	 * Runs printBaseInfo first and prints any other information unique to a Dictionary instance.
	 */
	@Override
	public void printInfo() {
		this.printBaseInfo();
		System.out.println("Language: " + this.getLangauge());
		System.out.println("Words Defined: " + this.getWordCount());
	}
}
