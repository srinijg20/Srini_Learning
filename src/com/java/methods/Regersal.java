package com.java.methods;

import java.util.ArrayList;
import java.util.List;

public class Regersal {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		
		num.add(10);
		num.add(30);
		num.add(10);
		int len=num.size()-1;
		System.out.println(len);
		int sum=0;
		for(int sum1:num)
		{
			sum+=sum1;
		}
		System.out.println(sum);
		int dup1=len*(len+1)/2;
		System.out.println(dup1);
		int  dup=sum-dup1;
		System.out.println(dup);
		
		
			
			
	}
}
