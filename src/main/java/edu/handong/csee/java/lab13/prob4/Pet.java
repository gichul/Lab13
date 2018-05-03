package edu.handong.csee.java.lab13.prob4;		//package name

public interface Pet 	//declare interface Pet
{
	public String food();		//abstract method
}



class Cat extends Animal implements Pet {  //Cat class inherits Animal and implements Pet
	@Override  //Annotations
	public String food()		//food method
	{
		return "(Cat!)" +"Fish";		//return the String
	}



}
class Dog extends Animal implements Pet {		//Dog class inherits Animal and implements Pet
	@Override	//Annotations
	public String food()		//food method
	{
		return "(Dog!)"+"Sausage";		//return the String
	}



}
