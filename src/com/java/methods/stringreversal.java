package com.java.methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class stringreversal {

	public static void main(String[] args) {
		stringreversal temp=new stringreversal();
		/*String x="Srinivasan";
		char str[]=x.toCharArray();
		System.out.println(x);
		int len=str.length;
		System.out.println("the lenght of the string is "+len);
		
		for (int i=len-1;i>=0;i--)
		{
			System.out.print(str[i]);
		}*/
//temp.reverse1();
temp.fibonocci();
	}
	
	public void reverse1()
	{
		String str="srini";
		StringBuilder st=new StringBuilder();
		st.append(str);
		System.out.println(st.reverse());
	}
	
	public void swap()
	{
		int a=10;
		int b=3;
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		System.out.println("a "+a +" and b is "+b);
		
		
	}
	
	public void swap1()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;		
		System.out.println("a "+a +" and b is "+b);
		
		
	}
	
	public void hashtest()
	{
		HashMap <Integer,String> temp=new HashMap<Integer,String>();
		temp.put(35, "Srini");
		temp.put(34, "Priya");
		temp.put(4,"Adhya");
		
		int x=temp.size();
		
		for (int i=0;i<x;i++)
		{
			System.out.println("key is ");
		}
	}
	
	public void prime()
	{
		Scanner sc= new Scanner(System.in);
		int i=1;
		
		for (int a=2;a<=100;a++)
		{
			if(a%i != 0)
			{
				System.out.println(a +"- it is prime");
				
			}
			i++;
			//break;
			
		}
	}
	
	public void palindrome()
	{
		String s="Malayalam";
		
		String y="";
		int z=s.length();
		char[] y1=s.toCharArray();
		System.out.println(y1.length);
		
		for (int i=z-1;i>=0;i--)
			
		{
			y=y+s.charAt(i);
		}
		
		if (s.equalsIgnoreCase(y))
		{
			System.out.println("string is palindrome ");
		}else
		{
			System.out.println("not");
		}
	}
	
	public void fibonocci() {
		
		int a=0;
		int b=1;
		for(int i=0;i<10;i++)
		{
			System.out.println(a);
			int temp=a+b;
			a=b;
			b=temp;
		}
	}
	
	public void arraylist()
	{
		ArrayList<String> temp=new ArrayList<String>();
		
		String str="My name is srini";
		String[] temp1=str.split(" ");
		/*for(int i=0;i<temp1.length;i++)
		{
			temp.add(temp1[i]);
		}*/
		
		for (String e :temp1)
		{
			temp.add(e);
		}
		System.out.println(temp.size()+ " " +temp.get(3));
		
		System.out.println(temp);
		
		Iterator itr=temp.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	public void checkduplicate()
	{
		String x="Sriinivvasann";
		
		char[] temp=x.toCharArray();
		for(int i=0;i<temp.length-1;i++)
		{
			if(temp[i]==temp[i+1])
					{
				System.out.println(temp[i]+ " is duplicated");
					}
		}
	}
	
	public void highestnumer() {
		
		//int[][] temp={{2,4,9,10},{1,2,3}};
		
		//System.out.println(temp[0][2]);
	}
	
	public void armstrong() {
		double x=15.3;
	
		System.out.println(x%10);
	}

}
