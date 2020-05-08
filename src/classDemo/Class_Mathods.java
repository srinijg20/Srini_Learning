package classDemo;

public class Class_Mathods 

{
	public static App_Library t;
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		//Class_Mathods obj1=new Class_Mathods(); 
		
		int c=Class_Mathods.sum(10, 20);
		
		System.out.println("the sum of 2 integers is " +c);
		
		int d=Class_Mathods.sum(c,45);
		
		System.out.println("the sum of 2 integers is " +d);
		
		Class_Mathods temp=new Class_Mathods();
		
		t=new App_Library();
		
		
		
	}
	
	public static int sum(int a,int b)
	{
		int c=a+b;
		
		return c;
		
	}

}
