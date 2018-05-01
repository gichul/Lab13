package edu.handong.csee.java.lab13.prob1;//package name

public class InstanceOf {  //declare class named InstanceOf
	
	public static void WhatFriend(Friend friend) {  //WhatFriend static method receiving instance name from main method 
		
		
		if(friend instanceof ClassFriend) {  //if friend instance is inherited from ClassFriend true
			((ClassFriend)friend).classFriend(); //type changing and by using classFriend method check the instance of reference variable friend3 
		}
		else if(friend instanceof SchoolFriend) { //if friend instance is inherited from SchoolFriend true
			((SchoolFriend)friend).schoolFriend(); //type changing and by using schoolFriend method check the instance of reference variable friend2 
		}
		else friend.justFriend();  //by using justFriend method check the instance of reference variable friend1
	}

}
