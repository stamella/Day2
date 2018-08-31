package com.capgemini.day2;

import java.util.Scanner;

public class StringPalindrome {

	public static String checkStringpalindrome(String dado, String not, String bye, String hello, String tat) {
		int k=0,count=0;
		String b=" ";
		String temp="";
		String words[] = {"dado","not","bye","hello","tat"};
		String palindrome[] = new String[5];
		for(int i=0;i<5;i++) {
			int n= words[i].length();
			for(int j=n-1;j>=0;j--)
			{
				b = b + words[i].charAt(j);
			}
			if(words[i].equals(b))
			{
				count++;
				palindrome[k]=words[i];
				k++;
			}
			b="";
		}
		for(int j=0;j<count-1;j++)
		{
			for(int i=0;i<count-j-1;i++)
			{
				int n =palindrome[i].length();
				int m=palindrome[i+1].length();
				if(n>m)
				{
					temp=palindrome[i+1];
					palindrome[i+1]=palindrome[i];
					palindrome[i]=temp;
				}
			}
   }
		for(int i=0;i<count;i++)
		{
			int n=palindrome[i].length();
			return palindrome[i];
		}
		return null;
   }	
}


		