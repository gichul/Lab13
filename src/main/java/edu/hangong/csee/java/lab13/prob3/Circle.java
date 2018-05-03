package edu.hangong.csee.java.lab13.prob3;	//naming package


public class Circle extends Shape {		//declare Circle class inherits Shape
	private double radius;		//declare private double type radius 
	public Circle(double r)		//constructor of Circle class	
	{
		this.radius = r;		// initiate radius to r
	}
	public double area()		//area method 
	{
		return Math.PI * Math.pow(radius, 2); // return the result double type
	}
	public double perimeter()		//perimeter method
	{
		return 2.0 * Math.PI * radius; // return the result double type 
	}
	public double get_Radius()		//getter method of radius
	{
		return radius;		//return the value
	}
	
	public void display() {		//to show on console declare display method
		System.out.println("Area : "+area()+"\nperimeter : "+ perimeter()); 	//showing the result sentence step by step

	}
}

