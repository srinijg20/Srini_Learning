package com.java.methods;

import java.util.ArrayList;
import java.util.Collections;

public class interviewSkills {

	public static void main(String[] args) {
		interviewSkills tb=new interviewSkills();
		/*boolean b=tb.intPalindrome(122);
		System.out.println(b);*/
		
		tb.arraysort();
	}
	
	public boolean intPalindrome(int number)
	{
		int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            System.out.println(reverse);
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;

	}
	
	public void arraysort()
	{
		ArrayList<String> temp=new ArrayList<String>();
		
		temp.add("srini");
		temp.add("triya");
		temp.add("adhya");
		Collections.sort(temp, Collections.reverseOrder());
		for (String x:temp)
		{
		System.out.println(x);
		}
		System.out.println("*******************");
		Collections.sort(temp);
		for (String x:temp)
		{
		System.out.println(x);
		}
		
	}

}
