package com.java.methods;

public class Fibonocci {

	public static void main(String[] args) {
		int sum=0, sum1=1;
		for(int i=1;i<8;i++)
		{
			System.out.println(sum);
			int sum2=sum+sum1;
			sum=sum1;
			sum1=sum2;
			
		}

	}

}
