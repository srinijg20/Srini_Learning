package com.java.methods;

import java.io.IOException;

public class Ternary_Operator {

	 
	
	public static void main(String[] args) {
		
		
				
		int r;
		for(int i=-2;i<2;i++)
		{
			
			//r=100/i;
				r= i!=0 ? 100/i:20;
				System.out.println(+i+" = "+r);
			
		}
		Ternary_Operator temp=new Ternary_Operator();	
temp.checkchar();
	}
	
	public void checkchar()
	{
		char c;
		int i;
		i=0;
		for (;i<10;i++)
		{
			try {
				c= (char) System.in.read();
				if(c=='q')
				{
					System.out.println("the entered character is "+c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
		}
			
	}

}
