package com.bridgelabz.functional;

import java.util.Scanner;

public class CountTriplet {
	public static void main(String[] args) {
		int n;
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Input number");
        int num = input.nextInt();
        sumTripplets(array,num);
    }
    public static void sumTripplets(int[] array, int num) {
        System.out.println("Sum of Triplets are ");
        for (int i = 0; i < array.length-2; i++)
        {
            for (int j = i+1; j < array.length-1; j++)
            {
                for (int k = j+1; k < array.length; k++)
                {
                    if (array[i]+array[j]+array[k] == num)
                    {
                        System.out.println("["+array[i]+", "+array[j]+", "+array[k]+"]");
                        break;
                    }
                }
            }
       }       
	}

}
