package com.basiccoreprogram;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter a Prime Num : ");
		int prime = num.nextInt();
		for (int i = 1; i <= prime + 1; i++) {
			if (prime % i == 0)
				System.out.println(i);
		}
	}


}