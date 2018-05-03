package edu.handong.csee.java.lab13.prob6; //package name

public class UpPoint implements CapitalPrintable { 		//UpPoint class inherits CapitalPrintable
	private int x, y; 		//declare private instance variable

	UpPoint(int x, int y){this.x = x; this.y = y;} //constructor declaration and initializing

	public String toString()		//String method toString
	{
		return "x : " + x + " y : " + y;	//return this statement
	}



}
