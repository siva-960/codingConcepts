package com.ram.recurssion;

public class Test
{
	private int a;
	public static void main(String args[])
	{
		Test t=new Test();
		t.a=10;
		Test t1=t;
		t1.a=20;
		System.out.println(t.a);
	}
}
