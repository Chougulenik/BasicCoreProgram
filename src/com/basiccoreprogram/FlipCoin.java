package com.basiccoreprogram;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.println("Enter Number of time flip coin");
		
		int head = 0;
		int tail = 0;
		int num = number.nextInt();
		for (int i=0; i<num; i++)
		{
			//Random random = new Random();
			double flipCoin = Math.random();
			//System.out.println(flipCoin);
			if(flipCoin < 0.5) {
				System.out.println("Head");
				head ++;
			}
			else
			{
				System.out.println("tail");
				tail ++;
			}	
				
		}	
		int Head = (head * 100)/num ;
		int Tail = (tail * 100)/num ;
		System.out.println("Percentage of Head :" +Head);
		System.out.println("Percentage of Tail :" +Tail);
		

	}

}
