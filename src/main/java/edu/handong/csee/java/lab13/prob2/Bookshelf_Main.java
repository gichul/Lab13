package edu.handong.csee.java.lab13.prob2; //package name

public class Bookshelf_Main { //declare main class

	public static void main(String[] args) {  //main method
		Book book=new Book("Simple Book");		//instantiation and input data to instance
		Science science=new Science("Hello Phisics!","Science World");  //instantiation and input data to instance
		History history=new History("What is history?","E.H.Carr"); //instantiation and input data to instance
		
		book.show();   //call the show method from book instance to see on console
		science.show();//call the show method from science instance to see on console
		history.show();//call the show method from history instance to see on console
		
		

	}

}
