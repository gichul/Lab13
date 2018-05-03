package edu.handong.csee.java.lab13.prob5; //package name
import java.util.Scanner; 		//to use keyboard import java.util.Scanner;

public class Prob4 {	//class prob4
	public static boolean equals(int[][] m1, int[][] m2) {  //declare static boolean equals mehtod to compare the m1,m2 2-d array
		int count = 0;		//declare instance variable
		if (m1.length != m2.length) // if the number of row is different, return false 
			return false;		//by if statement condition return boolean value
		for (int i = 0; i < m1.length; i++) 	// repetition of statement from 0 to the length of m1[i]
		{
			for (int j = 0; j < m1[i].length; j++)  // repetition of statement from 0 to the length of m1[i][j]
			{
				if (m1[i][j] != m2[i][j])			//compare the m1 with m2 
					count++;				//if upper statement is true count add the number 1 
			}
		}
		if(count <= 3)			//if statement to return boolean value
			return true;		//return 1
		else				//if statement to return boolean value
			return false;		//return 0
	}

	public static void main(String[] args) {	//declare main method
		int n1, n2 = 0;		//declare int type variable n1,n2;
		
		Scanner keyboard = new Scanner(System.in); //instantiation keyboard to use keyboard
		System.out.print("Enter row size(maximum 5): ");  //print sentence on console
		n1 = keyboard.nextInt(); 						//input the number of n1 from keyboard
		
		System.out.print("Enter column size(maximum 5): "); //print sentence on console
		n2 = keyboard.nextInt();							//input the number of n2 from keyboard
		
		int[][] m1 = new int[n1][n2];						//declare 2-d array instance m1
		
		System.out.print("Enter row size(maximum 5): ");//print sentence on console
		n1 = keyboard.nextInt();				//input the number of n1 from keyboard
		
		System.out.print("Enter column size(maximum 5): ");//print sentence on console
		n2 = keyboard.nextInt();			//input the number of n2 from keyboard
		
		int[][] m2 = new int[n1][n2];			//declare 2-d array instance m1
		
		System.out.print("Enter List1: ");//print sentence on console
		for (int i = 0; i < m1.length; i++)	// repetition of statement from 0 to the length of m1[i]
			for (int j = 0; j < m1[i].length; j++)  // repetition of statement from 0 to the length of m1[i][j]  
				m1[i][j] = keyboard.nextInt(); 		//input the data from keyboard by using repeating
		
		System.out.print("Enter list2: ");		//print sentence on console
		for (int i = 0; i < m2.length; i++){	// repetition of statement from 0 to the length of m2[i]
			for (int j = 0; j < m2[i].length; j++)  // repetition of statement from 0 to the length of m2[i][j] 
				m2[i][j] = keyboard.nextInt();		//input the data from keyboard by using repeating
		}
		for (int i = 0; i < m1.length; i++){		// repetition of statement from 0 to the length of m1[i]
			for (int j = 0; j < m1[i].length; j++)	// repetition of statement from 0 to the length of m1[i][j] 
				System.out.print(m1[i][j] + " ");		//print the int type variable step by step
			System.out.println();//print blank line on console
		}
		System.out.println();		//print blank line on console
		for (int i = 0; i < m2.length; i++){		// repetition of statement from 0 to the length of m2[i]
			for (int j = 0; j < m2[i].length; j++)  //repetition of statement from 0 to the length of m2[i][j] 
				System.out.print(m2[i][j] + " ");		//print the int type variable step by step
			System.out.println();//print blank line on console
		}
		System.out.println();	//print blank line on console


		if (equals(m1, m2)) //by calling equals method compare the two 2-d array
			System.out.println("The two arrays are approximately identical.");  	//if return is true execute this statement  
		else 				//else statement
			System.out.println("The two arrays are not identical");		//if return is false execute this statement  



	}



}

