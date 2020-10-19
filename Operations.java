package com.address.book;

public interface Operations {	

	public void createPerson(String bookID);

	public void updatePerson(String bookID);

	public void deletePerson(String bookID);

	public void sortByName(String bookID);

	public void sortByZIP(String bookID);

	public void displayBook(String bookID);

}
