package listinterface;

import java.util.ArrayList;
import java.util.Iterator;

///list is an interface which has only methods but no body
//Arraylist is a class which implements list
//list maintains the index order while set does not maintain the index order
public class Array_List 
{

	public static void main(String[] args) 
	
	{
		ArrayList obj1=new ArrayList();//non generic array list
		ArrayList <String> obj2= new ArrayList<String> ();//generic array list specifying the datatype
		
		obj1.add("srini");
		obj1.add('M');
		obj1.add(35);
		obj1.add(74.5);
		obj2.add("priya");
		obj2.add("gangadharan");
		obj2.add(1,"chenniah");
		
		for (Object a:obj1)
		{
			System.out.println("the array values are "+obj1.get(2));
			
			System.out.println("the array values are "+a);
		}
		
		Iterator itr=obj1.iterator();
		
		while(itr.hasNext())
			
		{
			Object x= itr.next();
			//System.out.println("iterator value "+itr.next());
			System.out.println("iterator value "+x);
		}
		
		for(String s:obj2) {
			System.out.println(s.length());
			System.out.println(obj2.size());
			System.out.println(s);
		}
		

	}

}
