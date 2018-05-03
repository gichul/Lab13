package edu.handong.csee.java.lab13.prob6;	//package name

public class Prob6 {//declare Prob6 class

	public static void main(String[] args) {//main method
		UpPoint p1 = new UpPoint(3,3);  //instantiation and in constructor input the value
		DownPoint p2 = new DownPoint(2,5); //instantiation and in constructor input the value
		DownPoint p3 = new DownPoint(4,7); //instantiation and in constructor input the value
		UpPoint p4 = new UpPoint(9,12); //instantiation and in constructor input the value
		Printer.print(p1);		//input the data to Printer static class 
		Printer.print(p2);		//input the data to Printer static class 
		Printer.print(p3);		//input the data to Printer static class 
		Printer.print(p4);		//input the data to Printer static class 
	}
}

