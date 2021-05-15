package week1.day2.assignments.optional;

import java.util.Arrays;

public class Anagram {
	
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */

	
public static void main(String args[]) {
	String s1="stops";
	String s2="otoss";
	if (s1.length()==s2.length()) {
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		System.out.println(a1);
		System.out.println(a2);
	if (Arrays.equals(a1,a2)) {
		System.out.println("strings are equal");
	}
	else {
		System.out.println("string are not equal");
	}
}
	else {
		System.out.println("not equal");
	}
}
}
