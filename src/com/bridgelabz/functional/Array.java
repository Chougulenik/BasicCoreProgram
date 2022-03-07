package com.bridgelabz.functional;

public class Array {
	//private static int n
	public static void main(String[] args) {
		int array[][] = new int [2][2];
		for(int m=0; m<2; m++) 
		{
			for(int n=0; n<2; n++)
			{
				array[m][n] = (int)( Math.random()*100);
				//System.out.println(array[m][n]);
			}
		}	
		System.out.println("2D Array");
		for(int m=0; m<2; m++)                   //rows
		{
			for(int n=0; n<2; n++)              //col
			{
				System.out.print(array[m][n] +" ");
			}
			System.out.print("\n");
	    }
		
    }

}
