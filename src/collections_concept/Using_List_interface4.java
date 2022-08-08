package collections_concept;

import java.util.LinkedList;
import java.util.Vector;

public class Using_List_interface4 {

	public static void main(String[] args)
	{
		//need to use Vector object
		Vector a=new Vector();
		
		//to add elments in array we use add()
		//we can use any type of data 
		a.add(10);
		a.add('a');
		a.add("snehal");
		a.add(20.56);
		
		//to print all element in collection                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		System.out.println(a);
		
		//to print single element we can use index wiht get ()
		System.out.println(a.get(0));
		
		//to replace perticular element we use set()
		a.set(3, 20);
		System.out.println(a.get(3));
		System.out.println(a);
		
		//to remove an element we use remove method
		a.remove(2);
		System.out.println(a);
		
		//we can add  only specific data in ArrayList as follow
		Vector <String> b=new Vector <String> ();
				b.add("Snehal");
				b.add("kadam");
				//a.add('e');		not possible
				//a.add("snehal"); not possible
				//we can add only int data in arraylist
				//then we can perfom all operations on this arrayelements
				System.out.println(b);
	}

}
