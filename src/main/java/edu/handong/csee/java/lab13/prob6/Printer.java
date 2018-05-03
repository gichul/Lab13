package edu.handong.csee.java.lab13.prob6; //package name

public class Printer {		//declare Printer class
	public static void print(Object object)		//static method print 
	{
		String str = object.toString();		//Reference variable str input the object.toString()method String
		if(object instanceof CapitalPrintable)	// this statement check the object instance of CapitalPrintable
			str = str.toUpperCase();		//by using str.toUpperCase() convert the alphabet 
		System.out.println(str);		//print the str String 
	}



}
