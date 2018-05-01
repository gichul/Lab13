package edu.handong.csee.java.lab13.prob2;

public class Bookshelf_Main {

	public static void main(String[] args) {
		Book book=new Book("Simple Book");
		Science science=new Science("Hello Phisics!","Science World");
		History history=new History("What is history?","E.H.Carr");
		
		book.show();
		science.show();
		history.show();
		
		

	}

}
