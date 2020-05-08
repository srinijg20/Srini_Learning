package com.java.methods;



public class PensionAutoEnrolment 
{
	

	public static void main(String[] args) 
	{
		Pension pen=new Pension();
		
		String Result=pen.fnPension_Enrol("W",25, 200.00);
		System.out.println("The result is "+Result);
		

	}

}

 class Pension
{
	 double Salary;
	public String fnPension_Enrol(String Period,int Age,double Salary1)
	{
	
	try {
		switch (Period)
		{
		case "W":
		Salary=Salary1*52.00;
		//System.out.println(Salary);
		break;
		case "M":
		Salary=Salary1*12.00;
		break;
		default :
			Salary=0.0;
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	System.out.println(Salary);
	
	if(Salary==0)
	{
		return "no duties as Salary is 0";
	}
	
		if(Age<16 || Age>74)
		{
			return "no duties";
		}
		if(Age>22 && Age<=65)
		{
			if(Salary>10000.0)
			{
				return "AutoEnrol";
			}else if(Salary<5876)
			{
				return "Entitled Worker";
			}else
			{
				return "non Eligible";
			}
			//System.out.println("the Annual Salary is "+Salary);
		}
		if(Age>15 && Age<22)
		{
			if(Salary>5876.0)
			{
				return "non Eligible";
			}else if(Salary<5876)
			{
				return "Entitled Worker";
			}
			System.out.println("the Annual Salary is "+Salary);
		}
		
		if(Age>65 && Age<=74)
		{
			if(Salary>5876.0)
			{
				System.out.println("the Annual Salary is "+Salary);
				return "non Eligible";
			}else if(Salary<5876)
			{
				System.out.println("the Annual Salary is "+Salary);
				return "Entitled Worker";
			}
			
			//System.out.println("the Annual Salary is "+Salary);
		}
		//return null;
		return null;
		
		
		
	}
}

