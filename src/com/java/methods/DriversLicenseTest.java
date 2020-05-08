package com.java.methods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

class DriverInput
{
	int Ans=0;
	
	public int fnTestStart(char A,int Q,int index)
	
	{
		ArrayList<Character> itemp=new ArrayList<Character>();
		itemp.add(index, A);
		ArrayList<Character> itemp1=new ArrayList<Character>();
		switch (Q)
		{
		case 1:
			if(A=='B')
			{
				Ans=Ans+1;
				itemp1.add(0, A);
				break;
			}
		case 2:
			if(A=='D')
			{
				Ans=Ans+1;
				itemp1.add(1, A);
				break;
			}
		}
		System.out.println("the answers are "+itemp.get(index));
		return Ans;
		
	}
}

public class DriversLicenseTest {

	public static void main(String[] args) throws IOException {
		DriverInput obj=new DriverInput();
		String temp;
		char c;
		/*temp=JOptionPane.showInputDialog(null, "Enter the ");
		int a=Integer.parseInt(temp);*/
		
		for (int i=0;i<2;i++)
		{
			c= (char) System.in.read();
			//temp=JOptionPane.showInputDialog(null, "Enter the answer for question "+(i+1));
			//int a =Integer.parseInt(temp);
			
			System.out.println(obj.fnTestStart(c, i+1, i));
		}

	}

}
