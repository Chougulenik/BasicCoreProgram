package com.bridgelabz.functional;

import java.util.Scanner;

public class DistanceBetweenTwoPoint {
	public static void main(String args[]) {
		 
		System.out.println("Enter the two point X & Y ");
		Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        

        // compute distance to (0, 0)
        double dist = Math.sqrt(x*x + y*y);
 
        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);

	}

}
