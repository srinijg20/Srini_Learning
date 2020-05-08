package inheritance;

public class childclass extends BaseClass
{
childclass(){
	super(12);
	System.out.println("child class");
}
	public static void main(String[] args) 
	{
		childclass obj1=new childclass();
		obj1.add(10, 20);
		obj1.sub(20, 10);
		childclass.mul(10, 25);
		obj1.dif(10, 5);
		
		BaseClass obj2=new BaseClass(25);
		obj2.add(1, 2);
		obj2.sub(2, 1);
		
		BaseClass obj3=new childclass();
		obj3.add(12, 12);
		obj3.sub(12, 13);
		mul(10,20);
		mul(1,2);
		
		
		//childclass obj4=new BaseClass();
		
	}
	
	public static void mul (int a, int b)
	{
		int c=a*b;
		System.out.println("the prod is "+c);
	}
	
	public void dif (int a, int b)
	{
		int c=a/b;
		System.out.println("the mod is "+c);
	}

}
