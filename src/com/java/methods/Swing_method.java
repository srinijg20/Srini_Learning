package com.java.methods;

import javax.swing.JOptionPane;

public class Swing_method {
	
	public static void main(String[] args) {
		String temp;
		temp=JOptionPane.showInputDialog(null, "Enter the first numer");
		int a=Integer.parseInt(temp);
		temp=JOptionPane.showInputDialog(null, "Enter the first numer");
		int b=Integer.parseInt(temp);
		JOptionPane.showMessageDialog(null,"Sum is " +(a+b));
	}

}
