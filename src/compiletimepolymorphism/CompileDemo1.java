package compiletimepolymorphism;

public class CompileDemo1 
{

	public static void main(String[] args) 
	
	{
		CompileDemo1 obj1=new CompileDemo1();
		obj1.add(10, 20);
		obj1.add(10.2, 10);
	}
	
	///method overloading --method name is same by arguments different
		public void add (int a,int b)
		{
			int c=a+b;
			
			System.out.println("sum is " +c);
		}
		
		public void add (int a,int b ,int d)
		
		{
			int c=a+b+d;
			System.out.println("sum is " +c);
		}
		
		public void add (double a,int b)
		
		{
			double c=a+b;
			System.out.println("sum is " +c);
		}
			
	}

	


