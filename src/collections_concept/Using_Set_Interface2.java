package collections_concept;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Using_Set_Interface2 {

	public static void main(String[] args) 
	{
		LinkedHashSet a=new LinkedHashSet();
		// we can add any value in hashset 
		a.add(10);
		a.add(20);
		a.add(30);
		a.add('g');
		a.add("this is hashset class");
		System.out.println(a);
		
		//a.get(3);  not possible because of indexing concept is not present in set interface
		
		//a.set(); also not available
		
		a.remove(30);
		System.out.println(a);
		
		// to add only perticular's datatype value 
		LinkedHashSet <Double> b=new LinkedHashSet <Double>();
		b.add(10.20);
		b.add(65.2315);
		b.add(8956.12);
		//b.add("shd");		// not possible 
		System.out.println(b);
		
		b.remove(10.20);
		System.out.println(b);
		
	}

}
