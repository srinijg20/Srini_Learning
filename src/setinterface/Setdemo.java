package setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) 
	{
///hashset is set and values are set in random order
		HashSet<String> values= new HashSet<>();
		
		Set value2=new HashSet();
		value2.add("2");
		
		values.add("srini");
		values.add("priya");
		values.add("adhya");
		
		System.out.println("the values are as follows "+values);
		
///converting set to list
		ArrayList<String> list=new ArrayList<>(values);
		System.out.println(list.get(1));
///linkedhashset is list and values are set in the given order
		LinkedHashSet<String> values1= new LinkedHashSet<>();
		
		values1.add("srini");
		values1.add("priya");
		values1.add("adhya");
	
		
		System.out.println("the values are as follows "+values1);
///treeset is list and values arein ascending order		
		TreeSet<String> values2= new TreeSet<>();
		
		values2.add("srini");
		values2.add("priya");
		values2.add("adhya");
		
		System.out.println("the values are as follows "+values2);
		
		

	}

}
