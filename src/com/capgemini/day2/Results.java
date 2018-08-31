package com.capgemini.day2;

public class Results {

	public static String grade(double maths,double english,double hindi) {
    if(maths<=100 && english<=100 && hindi<=100) {
		if(maths>=60 && english>=60 && hindi>=60) {
			return "pass";
		}
		else if((maths>=60 && english>=60) || (maths>=60 && hindi>=60) || (english>=60 && hindi>=60)) {
			return "promote";
		}
		else if((maths<60 && english<60) || (maths<60 && hindi<60) || (english<60 && hindi<60)) {
			return "fail";
		}
    }
	    return null;	
	
		
		
		// TODO Auto-generated method stub
	}

}
