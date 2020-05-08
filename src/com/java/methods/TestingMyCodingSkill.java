package com.java.methods;

import javax.swing.JOptionPane;
import org.apache.commons.*;

public class TestingMyCodingSkill {
	int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 obj = new test1();
		//obj.fnprintname();
		//double val=obj.calc(25.5,3.5,40.5,4.5);
		//System.out.println("the calculated value is "+val);
		//obj.compare(15, 20);
		//obj.compare3int();
		obj.booleanArray();
		//obj.oddeven();
		

	}

}

class test1 {
	TestingMyCodingSkill obj2=new TestingMyCodingSkill();
	
	public void fnprintname() {
		System.out.println("Hello");
		System.out.println("Srinivasan");
	}
	
	public double calc(double a,double b,double c,double d)
	
	{
		double e=(a*b)-(b*b);
		double f=c-d;
		double g=e/f;
		return g;
		
	}
	
	public void compare(int a,int b)
	{
		if(a !=b)
		{
			System.out.println(a+"!="+b);
		}
		
		if(a < b)
		{
			System.out.println(a+"<"+b);
		}
		
		if(a <=b)
		{
			System.out.println(a+"<="+b);
		}
	}
	
	public void compare3int()
	{
		String temp;
		temp=JOptionPane.showInputDialog(null,"Enter the first number");
		int a=Integer.parseInt(temp);
		temp=JOptionPane.showInputDialog(null,"Enter the second number");
		int b=Integer.parseInt(temp);
		temp=JOptionPane.showInputDialog(null,"Enter the third number");
		int c=Integer.parseInt(temp);
		
		if(a==b && a==c)
		{
			System.out.println("values of first,second and third integer are same and their values are "+a+", "+b+", "+c);
		}else if(a!=b & a==c) 
		{
			System.out.println("values of first and third integer are matching and the second doesn match, values are "+a+", "+b+", "+c);
		}else if(a==b & a!=c)
		{
			System.out.println("values of first,second  are same and their values are "+a+", "+b+", "+c);
		}
		
	}
	
	public void booleanArray()
	{
		boolean[][] temp= {{true,false,true},{false,false,true}};
		
		int row=temp.length;
		System.out.println(+row);
		int col=temp[0].length;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				if(temp[i][j]==true)
				{
					System.out.print("t");
				}else {
					System.out.print("f");
				}
			System.out.println();
		}
	}	
	public void oddeven()
	{
		String temp="id=username";
		String[] itemp=temp.split("=");
		String a=itemp[0];
		System.out.println(a);
		
		String i="100";
		int c=Integer.parseInt(i);
		System.out.println(c);
		double d=Double.parseDouble(i);
		System.out.println(d);
		double f=c+d;
		System.out.println(f);
		
		
		
	}
		
	

}
