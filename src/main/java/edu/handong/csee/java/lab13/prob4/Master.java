package edu.handong.csee.java.lab13.prob4;  //package name
import java.util.Scanner; 		//to use keyboard import Scanner

public class Master {		//declare public class Master
	public void feed(Pet pet)		//feed method receiving pet method
	{
		System.out.println("feed: " + pet.food());		//to show kind of food from pet interface
	}


	public static void main(String[] args) {		//main method
		String cat_name, dog_name;  //to naming cat&dog name

		Master master = new Master(); //Master method instantiation
		Cat cat = new Cat();	//Cat method instantiation
		Dog dog = new Dog(); //Dog method instantiation

		Scanner keyboard = new Scanner(System.in);  //declare keyboard instance 
		System.out.print("Enter the cat name and dog name: "); //print this statement on console
		cat_name = keyboard.next();  //input String type variable to cat_name
		dog_name = keyboard.next();  //input String type variable to dog_name

		cat.setName(cat_name);		//setter method the setName
		cat.getName();			//getter method print the sentence on the console
		master.feed(cat);		//	in master instance.feed method input the cat instance to reference variable and call the food method
			

		dog.setName(dog_name);		//setter method the setName
		dog.getName();		//getter method print the sentence on the console
		master.feed(dog);		//	in master instance.feed method input the dog instance to reference variable and call the food method
	}
}
