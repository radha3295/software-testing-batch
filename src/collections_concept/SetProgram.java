package collections_concept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args)
	{
		Set s=new HashSet();
		s.add(39);
		s.add("sndhfjdlkjfldj");
		s.add('d');
		s.add(542.20);
		System.out.println(s);
		
		s.remove('d');
		System.out.println(s);
	
		
		// to allow to enter perticular value 
		Set<Integer> s2=new HashSet<Integer>();
		s2.add(12);
		s2.add(52);
		s2.add(45454);
		s2.add(400);
		s2.add(null);
		//s2.add("slkfjdkfjdfjdjfj");	// not possible 
		System.out.println(s2);
		
		
		// s2.get();		// not possible 
		// in set interface indexing concept is not present so get () not applicable 
		// so to call element one by one iterator class concept is used in set
		Iterator it=s2.iterator();
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		
		//OR
		
		for(int i=1;i<=s2.size();i++)
		{
			System.out.println(it.next());
		}
	}

}
