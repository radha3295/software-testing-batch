package collections_concept;

import java.util.ArrayList;
import java.util.List;

public class ListProgram {

	public static void main(String[] args)
	{
		List a=new ArrayList(); 	//upcasting
		a.add(10);
		a.add("snehal");
		a.add('e');
		System.out.println(a);
		
		a.get(2);
		
		a.set(2, "shreesha");
		System.out.println(a);
		
		a.remove(0);
		System.out.println(a);
		
		// to allow to enter only perticular vlues 
		List<Character>c=new ArrayList<Character>();
		
		c.add('a');
		c.add('b');
		//c.add("c");      //not possible 
			
		}
}

