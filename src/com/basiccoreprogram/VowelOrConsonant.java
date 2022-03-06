package com.basiccoreprogram;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char latter = 0;
		System.out.println("Enter any character : ");
		Scanner ch = new Scanner(System.in);
		 char letter = ch.next().charAt(0);
		
		if (latter == 'a' || latter == 'e' || latter == 'i' || latter == 'o' || latter == 'u')
			System.out.println(letter + " Vovel");
		else	  
			System.out.println(letter + " Consonant");
	}

}
