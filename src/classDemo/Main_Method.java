package classDemo;

public class Main_Method {

	public static void main(String[] args) 
	{
		int add=App_Library.sum1(10, 20);
		System.out.println("addition of 2 numbers is "+add);
		
		int sub=App_Library.diff(add, 25);
		System.out.println("difference of 2 numbers is " +sub);
		
		App_Library obj1=new App_Library();
		obj1.getCountryCode("+917813086278");
		
		int agevise=App_Library.getAge("srini");
		System.out.println("the age of the person in "+agevise );

	}

}
