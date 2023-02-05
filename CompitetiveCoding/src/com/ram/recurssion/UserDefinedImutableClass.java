package com.ram.recurssion;

final public class UserDefinedImutableClass
{
	private int value;
	public UserDefinedImutableClass(int value)
	{
		this.value=value;
	}
	public UserDefinedImutableClass modify(int value)
	{
		if(this.value==value)
			return this;
		else
			return new UserDefinedImutableClass(value);
	}
	
	public static void main(String[] args)
	{
		UserDefinedImutableClass t=new UserDefinedImutableClass(10);
		UserDefinedImutableClass t1=t.modify(100);
		UserDefinedImutableClass t2=t.modify(10);
		System.out.println(t==t1);
		System.out.println(t==t2);
	}
}
