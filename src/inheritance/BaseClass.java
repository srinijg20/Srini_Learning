package inheritance;

public class BaseClass 

{
	int a=10;
	BaseClass(int a){
		System.out.println("base class :"+a);
		this.a=a;
	}
	public void add (int a, int b)
	{
		int c=a+b;
		System.out.println("the sum is "+c);
	}
	
	public void sub (int a, int b)
	{
		int c=a-b;
		System.out.println("the diff is "+c);
	}
	

}
