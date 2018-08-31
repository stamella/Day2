package com.capgemini.day2;

public class Search {

	public static String FindElement(double x) {
     	int n=15;
		int i=0;
		int flag=0;
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(i=0;i<n;i++) {
	    	if(a[i]==x) {
	    		flag=1;
	    		break;
	    	}
	    	else {
	    		flag=0;
	    	}
	    }
	    if(flag==1) {
	    	return "present";
	    }
	    else 
		return "not present";
	}

}
