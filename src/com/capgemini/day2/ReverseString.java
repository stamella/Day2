package com.capgemini.day2;

public class ReverseString {

	public static String printReverse(String string) {
		// TODO Auto-generated method stub
		String original = "hi swathi",reverse = " ";
		int length = original.length();
		for(int i = length-1; i>=0;i--) 
		     reverse = reverse + original.charAt(i);
		return reverse;
    }

}

