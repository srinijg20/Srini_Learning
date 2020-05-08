package listinterface;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
		int[] b = new int[8];
		Arrays.sort(testArray);
		
		for(int i=testArray.length-1;i>0;i--)
		{
			//System.out.println(testArray[i]);
			b[i]=testArray[i]-testArray[i-1];
			//System.out.println(b[i]);
			
		}
		//System.out.println("*********");
		Arrays.sort(b);
		System.out.println(b[1]);
	}

}
