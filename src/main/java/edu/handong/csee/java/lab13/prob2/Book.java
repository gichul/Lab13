package edu.handong.csee.java.lab13.prob2; //package name

public class Book {  // declare class Book
	
	private static int num=0;  //declare static method to automatically to increase when create objects
	
	private int id;  //to store the number of Id declare instance variable
	String bookName;  //declare instance variable bookName
	
	
	public Book(String Name){  //declare constructor Book
		this.bookName=Name; 	//initiation of bookName 
		num++;				//to add 1. declare this statement when create objects 
		id=num;			//from numb input the data into id
		
	}
	
	public String toString() { 			//toString method to reuse in other classes
		return "\n\tId : "+ id+"\n\tBook Name : "+bookName;  		//to see output easily decide order step by step 
		
	}
	
	public void show() {			//to print the result on console declare show method
		System.out.println("<<<<Book>>>>"+this.toString());  		//print result statement
		
	}
	
}
