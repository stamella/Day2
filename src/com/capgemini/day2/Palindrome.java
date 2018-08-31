package com.capgemini.day2;

public class Palindrome {

	public static Object checkPalindrome(int number) {
		// TODO Auto-generated method stub
		int digit;
		int Sum = 0;
		int OriginalNumber = number;
		while(number > 0)
        {
            digit = number % 10;
            Sum = Sum * 10 + digit;
            number = number / 10;
        }
        if(OriginalNumber == Sum)
        {
           return true;
        }
        else {
		return false;
	}
}
}