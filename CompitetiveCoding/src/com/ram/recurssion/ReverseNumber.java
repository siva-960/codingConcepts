package com.ram.recurssion;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		reverseNumber(n);
	}
	
	public static void reverseNumber(int n)
	{
		if(n<=0)
			return;
		else
		{
			System.out.print(n%10);
			reverseNumber(n/10);
		}
			
	}

}
