package com.basiccoreprogram;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter any two  number");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println(num1+ " " + num2);
		

	}

}
