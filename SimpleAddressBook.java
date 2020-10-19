package com.address.book;
import java.util.List;

public class SimpleAddressBook {

	private String bookID;
	private List<Person> persons;

	public SimpleAddressBook(String bookID, List<Person> persons) {
		this.bookID = bookID;
		this.persons = persons;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}
