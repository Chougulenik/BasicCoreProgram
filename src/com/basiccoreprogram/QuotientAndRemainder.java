package com.basiccoreprogram;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two number : ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int quotient = (int) Math.floor(num1/num2);
		int remainder = num1%num2;
		System.out.println("Quotient : "+quotient);
		System.out.println("Remainder: "+remainder);

	}

}
