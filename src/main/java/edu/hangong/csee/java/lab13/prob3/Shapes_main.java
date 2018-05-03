package edu.hangong.csee.java.lab13.prob3; //package name
import java.util.Scanner;	//import Scanner to input data from keyboard


public class Shapes_main {		//declare main class

	public static void main(String[] args) { //declare static main method 

		double n1, n2;		//declare double type variable n1,n2
		Scanner keyboard = new Scanner(System.in);		//

		System.out.print("Enter radius: ");		//statement to show sentence
		n1 = keyboard.nextDouble();		//input double type variable to n1
		Circle c1 = new Circle(n1);		//instantiation and input the n1 to instance

		System.out.println("Radius: "+ c1.get_Radius());		//statement to show sentence and getter method
		c1.display();		//to print the result showing the result on console 

		System.out.print("Enter length and width: ");	//statement to show sentence
		n1 = keyboard.nextDouble();	//input double type variable to n1
		n2 = keyboard.nextDouble();	//input double type variable to n2
		Rectangle r1 = new Rectangle(n1, n2);	//instantiation and input the n1 to instance

		System.out.println("Length: "+ r1.get_Length());	//statement to show sentence and getter method
		System.out.println("Width: "+ r1.get_Width());	//statement to show sentence and getter method
		r1.display();	//to print the result showing the result on console 
	}



}
