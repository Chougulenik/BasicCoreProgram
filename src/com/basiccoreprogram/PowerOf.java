package com.basiccoreprogram;

import java.util.Scanner;

public class PowerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value num");
		
		int num = input.nextInt();
		if (num>0 && num<31) 
			
			for (int i=0; i<=num; i++)
			{
				System.out.println(i+ " " +(int)Math.pow(2,i));
			}
			
	}

}
