package com.capgemini.day2;

public class Multidimensional {

	public static Object searchElement(int[][] is) {
		// TODO Auto-generated method stub
		int val_s=2;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++)
			{
				if(val_s==is[i][j])
				{
					return "Found";
				}
			}
		}
		return null;
	}

}
