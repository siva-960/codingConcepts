package com.ram.recurssion;

import java.util.Scanner;

public class IsPalindrone {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a String");
		String st=s.next();
		System.out.println(isPalindrone(0, st.length()-1, st));
	}
	
	public static boolean isPalindrone(int i,int j,String s)
	{
		if(i>j)
			return true;
		if(s.charAt(i)!=s.charAt(j))
			return false;
		return isPalindrone(i+1, j-1, s);
	}

}
