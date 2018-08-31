package com.capgemini.day2;
import java.text.DateFormatSymbols;

public class Date {
	public static String checkDate(int x,int y,int z) {
		String string="";
		int date=x;
		int month=y;
		int year=z;
		switch(month)
		{
		case 1: string="January";
		break;
		case 2: string="febuary";
		break;
		case 3: string="march";
		break;
		case 4: string="april";
		break;
		case 5: string="May";
		break;
		case 6: string="June";
		break;
		case 7: string="July";
		break;
		case 8: string="august";
		break;
		case 9: string="september";
		break;
		case 10: string="october";
		break;
		case 11: string="november";
		break;
		case 12: string="december";
		break;
		default:System.out.println("wrong entered date"+string);
		}
		String converted=date+"/"+string+"/"+year;
		return converted;
		
		}
	}


	




