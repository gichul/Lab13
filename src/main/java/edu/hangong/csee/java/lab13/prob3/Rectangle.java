package edu.hangong.csee.java.lab13.prob3; //package name

public class Rectangle extends Shape {//declare Rectangle class inherits Shape
	private double length;//declare private double type length
	private double width;//declare private double type width
	public Rectangle(double length, double width) //constructor of Rectangle class	
	{
		this.length = length;// initiate this.length to length
		this.width = width;// initiate this.width to width
	}
	public double area()//area method 
	{
		return length * width;// return the result double type
	}
	public double perimeter()	//perimeter method
	{
		return 2*(length+width); 	// return the result double type 
	}
	public double get_Length()	//getter method of length
	{
		return length;	//return the value
	}
	public double get_Width()	//getter method of length
	{
		return width;	//return the value
	}
	public void display() {//to show on console declare display method
		System.out.println("Area : "+area()+"\nperimeter : "+ perimeter());//showing the result sentence step by step

	}
	
}
