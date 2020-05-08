package com.java.methods;

public class WrapperConcept {

	public static void main(String[] args) {
		String temp="id=username";
		String[] itemp=temp.split("=");
		int z=itemp.length;
		System.out.println(z);
		String a=itemp[0];
		System.out.println(a);
		
		String i="100";
		int c=Integer.parseInt(i);
		System.out.println(c);
		double d=Double.parseDouble(i);
		System.out.println(d);
		double f=c+d;
		System.out.println(f);
		
		int j=100;
		String s=String.valueOf(j);
		System.out.println(s+120);

	}

}
