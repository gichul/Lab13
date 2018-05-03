package edu.handong.csee.java.lab13.prob4;//package name

public class Animal {		//class Animal
	private String name;		//declare private type String name variable;
	public void setName(String name)	//setter method
	{
		this.name = name;		//in instance variable set the String name
	}
	public void getName()			//getter method
	{
		System.out.println("Name: "+name);		//show the name on console by using print 
	}
}

