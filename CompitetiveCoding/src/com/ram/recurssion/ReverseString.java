package com.ram.recurssion;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args)
	{
//		Scanner s=new Scanner(System.in);
//		String st=new String("ram");
//		st.concat("kittu");//eligible garbage collection since String object is immutable if u made any changes it will create new object but here created object is 
//		//doesn't referenced by any variable so it is removed by garbage collecter.
//		System.out.println(st);
//		StringBuffer sb=new StringBuffer("pravee");
//		sb.append("macha");
//		System.out.println(sb);//since sb object is mutable if we made any changes it will make that changes in existing object only but not creates any new objects
//		
//		//Case:2
//		
//		String s1=new String("ram");
//		String s2=new String("ram");
//		//System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		
//		StringBuffer s3=new StringBuffer("ram");
//		StringBuffer s4=new StringBuffer("ram");
//		System.out.println(s3==s4);
//		System.out.println(s3.equals(s4));
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter String");
		String st=s.next();
		System.out.println(reverseString(0, st.length()-1, new StringBuffer(st)));
				
	}
	
	public static String reverseString(int i,int j, StringBuffer s)
	{
		if(i>=j)
			return new String(s);
		char ch=s.charAt(j);
		s.setCharAt(j, s.charAt(i));
		s.setCharAt(i, ch);
		//System.out.println(s);
		return reverseString(i+1, j-1, s);
		
	}
}
