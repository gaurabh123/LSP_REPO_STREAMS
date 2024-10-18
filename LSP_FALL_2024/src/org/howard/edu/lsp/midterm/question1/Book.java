package org.howard.edu.lsp.midterm.question1;

/**
 * Represents a book in a library. 
 * 
 */
public class Book {
	
	private String title; 
	private String author; 
	private String ISBN; 
	private int yearPublished; 
	
	/**
	 * Constructor for Book class 
	 * 
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param yearPublished
	 * 
	 */
	public Book(String title, String author, String ISBN, int yearPublished) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.yearPublished = yearPublished;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	/**
	 * Overriding the equals object. 
	 * 
	 * @param bookObj Object. 
	 * @return  boolean
	 * 
	 */
	public boolean equals(Book bookObj) {
		
		if (this.ISBN.equals(bookObj.ISBN) && this.author.equals(bookObj.author)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
     * Overriding the toString method.
     * 
     * @return String
     * 
     */
    @Override
    public String toString() {
    	return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
	
}
