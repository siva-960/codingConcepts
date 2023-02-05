package com.ram.recurssion;

public class RecurssionExcutionTree 
{
	public static void main(String[] args)
	{
		fun(4);
	}
	
	public static void fun(int n)
	{
		if(n==1)
			return;
		System.out.print(n+" ");
		fun(n-1);
		System.out.println(".............. over first function call");
			System.out.print(n+" ");
		fun(n-1);
		System.out.println(".................over second function call");
	}
}
