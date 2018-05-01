package edu.handong.csee.java.lab13.prob2; //package name

public class History extends Book {  //History class that inherits Book class 
	private String Author;		//declare Author String
	
	public History(String name, String author) { //constructor of History 
		super(name);		//input the name String upper class to initiate bookName
		this.Author=author; 		//input the author String to initiate
		
			}
	
	public String toString() {		//information of printing order and superclass
		return super.toString()+"\n\tAuthor : "+Author;  ////to see output easily decide order step by step 
	}
	
	public void show() {  //to print the result on console declare show method
		System.out.println("<<<<History>>>>"+toString());//print result statement
		
	}
}
