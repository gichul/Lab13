package edu.handong.csee.java.lab13.prob2;

public class Book {
	
	private static int num=0;
	
	private int id;
	String bookName;
	
	
	public Book(String Name){
		this.bookName=Name;
		num++;
		id=num;
		
	}
	
	public String toString() {
		return "\n\tId : "+ id+"\n\tBook Name : "+bookName;
		
	}
	
	public void show() {
		System.out.println("<<<<Book>>>>"+this.toString());
		
	}
	
}
