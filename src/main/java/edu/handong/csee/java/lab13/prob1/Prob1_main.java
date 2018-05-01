package edu.handong.csee.java.lab13.prob1;//package name

public class Prob1_main {  //main class 

	public static void main(String[] args) {  //main method 
		// TODO Auto-generated method stub
		Friend friend1=new Friend();		//declare class Friend instantiation and reference Variable friend1
		SchoolFriend friend2=new SchoolFriend(); //declare class SchoolFriend instantiation and reference Variable friend2
		ClassFriend	friend3=new ClassFriend(); //declare class ClassFriend instantiation and reference Variable friend3
		
		InstanceOf.WhatFriend(friend1); //call the WhatFriend static method to check the relationship corresponding to their instances.
		InstanceOf.WhatFriend(friend2);//call the WhatFriend static method to check the relationship corresponding to their instances.
		InstanceOf.WhatFriend(friend3);//call the WhatFriend static method to check the relationship corresponding to their instances.
	}

}
