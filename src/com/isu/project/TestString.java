package com.isu.project;

public class TestString {
public static void main(String[] args) {
	String str = new String("dhiru");
	String str1 = "Dhirendra";
	String str2 = new String("Dhirendra");
	System.out.println("the string is:-"+str1.hashCode());
	System.out.println("the string is:-"+str2.hashCode());
	Object object = new Object();
}
}
