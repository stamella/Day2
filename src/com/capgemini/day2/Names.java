package com.capgemini.day2;

public class Names {

	public static Object findDuplicates(String[] s1, String search) {
		int i,c=0;
		for(i=0;i<s1.length;i++)
		{
			if(s1[i].compareTo(search)==0)
			{
				c++;
			}
		}
		return c;
	}

}
