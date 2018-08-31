package com.capgemini.day2;

public class Armstrong {

	public static Object checkArmstrongNumber(int number) {
		// TODO Auto-generated method stub
		int digit;
		int sum=0;
		int originalNumber;
		originalNumber= number;
		while(number!=0) {
			digit=number % 10;
			sum += digit*digit*digit;
			number = number/10;
		}
		if(sum==originalNumber) {
		return true;
	    }
		return false;
	}
	

}
