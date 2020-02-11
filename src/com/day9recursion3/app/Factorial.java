package com.day9recursion3.app;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		int number;
		Scanner input = new Scanner(System.in);
		
		// Telling the user to input a number so the program can tell the factorial 
		System.out.println("Imput a Number: ");
		number = input.nextInt();
		
		// Verifying that it is a positive number 
		while(number<=0)
		{
			System.out.println("Input a positive number");
			System.out.println("Imput anothere Number: ");
			number = input.nextInt();
		}
		
		// Printing the factorial of the number
		System.out.println("Your Factorial number ir: "+Factorial(number));
		

	}

// Method to know the factorial 
 public static int Factorial(int n)
{
	if(n <= 1)
	{
		return 1;
	}
	else
	{
		return n * Factorial(n-1);
	}
}
}