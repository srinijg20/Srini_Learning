package com.java.methods;

public class FlightDriverClass  {

	public static void main(String[] args) {
		FlightBaseClass obj=new FlightBaseClass("British Airways", "BA1789", "London HeathRow", "Bangalore BLR");
		FlightDriverClass obj1=new FlightDriverClass();
		//FlightDriverClass obj2=new FlightBaseClass();
		obj1.fnSum(10, 20);
obj.fnFlightDetails();
String a=obj.fnGetAirline();
System.out.println(a);
//obj2.fnSum(a, b);
	}
	public void fnSum(int a,int b)
	{
		int c=a+b;
		System.out.println("out put is"+c);
	}

}
