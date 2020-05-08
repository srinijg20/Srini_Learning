package classDemo;

public class App_Library 

{
	
	public static int sum1(int a,int b)
	{
		int c=a+b;
		
		return c;
		
	}
	
	public static int diff(int a,int b)
	{
		int c=b-a;
		
		return c;
		
	}
	
	public void getCountryCode(String a)
	{
		int x=a.length();
		System.out.println("the  length of the number is "+x);
		String s1=a.substring(0,3);
		System.out.println("First three char of the number is "+s1);
		
		if(s1.equalsIgnoreCase("+44"))
		{
			System.out.println("The number is UK based");
		}
		else if (s1.equalsIgnoreCase("+91"))
		{
			System.out.println("The number is India based");
		}
		
		else if (s1.equalsIgnoreCase("+01"))
		{
			System.out.println("The number is US based");
		}
		
		else
		{
			System.out.println("The number is Unkmown");
		}
		
	}
	
	public static int getAge(String name)
	
	{
		int age = 0;
		switch(name)
		{
			case "srini":
			 age=35;
		
		//System.out.println("the age of the person is "+age);
		break;
		case "priya":
			 age=34;
			//System.out.println("the age of the person is "+age);
			break;
		}
		
		return age;
		
		
		
	}
	

}
