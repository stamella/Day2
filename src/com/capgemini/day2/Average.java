package com.capgemini.day2;

public class Average {

	public static double calcStudentSum(double biology, double chemistry, double physics) {		
		double Sum = biology + chemistry + physics;
        return Sum;
	}
    public static int calcStudentAverage(int biology, int chemistry, int physics) {		
    	int Sum = biology + chemistry + physics;   
    	int Average = Sum/3;
	return Average;
    }
	public static double calcSubjectSum(int swathi, int shiny, int divya) {
		// TODO Auto-generated method stub
		int Sum=swathi+shiny+divya;
		return Sum;
	}
	public static double calcSubjectAverage(int swathi, int shiny, int divya) {
		// TODO Auto-generated method stub
		int Sum=swathi+shiny+divya;
		int Average=Sum/3;
		return Average;
	}


}
