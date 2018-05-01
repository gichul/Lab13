package edu.handong.csee.java.lab13.prob2;		//package name

public class Science extends Book{		 //Science class that inherits Book class 
	
	private String publisher; //declare publisher String
	
	public Science(String name, String Publisher) 
	{
		super(name);//input the name String upper class to initiate bookName
		this.publisher=Publisher;//input the Publisher String to initiate
	}
	
	public String toString() { //information of printing order and superclass
		return super.toString()+"\n\tPublisher : "+publisher; ////to see output easily decide order step by step 
	}
	
	public void show() {  //to print the result on console declare show method
		System.out.println("<<<<Science>>>>"+this.toString()); //print result statement
	}
}
