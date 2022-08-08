package collections_concept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_n_Set_Difference {

	public static void main(String[] args) 
	{
		System.out.println("++++++++++++++++List program+++++++++++++++++++++++++++++++++");
		//List program
		List a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(30);		// printing added dublicate values 
		a.add(20);
		System.out.println(a);			// result is printing in sequence ie. maintain order of insertion
		
		a.add(null);
		a.add(null);	// can printnull value 
		System.out.println(a);
		
		System.out.println("++++++++++++++++Set program+++++++++++++++++++++++++++++++++");
		//Set program
		Set b=new HashSet();
		b.add(10);
		b.add(50);
		b.add(65);
		b.add(10);					//not printing dublicate value 
		b.add(65);
		System.out.println(b);			// not maintain allowing order of insertion
		
		b.add(null);
		System.out.println(b);		// not printing null value 
		
		
		}

}
