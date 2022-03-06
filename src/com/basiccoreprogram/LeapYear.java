package com.basiccoreprogram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter a 4 digit number ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		if( year%100 == 0 && year%400 ==0 || year%100 != 0 && year%4 == 0 )
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");

	}

}
