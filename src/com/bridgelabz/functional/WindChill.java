package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature t : ");
        int t = input.nextInt();
        System.out.println("Enter wind speed v : ");
        int v = input.nextInt();
        
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
	}

}
