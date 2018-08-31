package com.capgemini.day2;

public class CalcInterest {

	public static Object simpleInterest(double amount, double years, double Roi) {
	double simpleInterest;
		
		// TODO Auto-generated method stub
		return simpleInterest=(amount * years * Roi)/100;
	}
	public static Object CompoundInterest(double amount, double years, double Roi) {
			double compoundInterest;
			// TODO Auto-generated method stub
			return compoundInterest=amount * Math.pow(1.0+Roi/100.0,years) - amount;

}
}
