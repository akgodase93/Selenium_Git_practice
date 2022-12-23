/*
1. Doesn't allow duplicate values
2. Allow only 1 null value.
3. Order of insertion->maintained
4. No default capacity
5. DS: Hybrid (Linear+ Hashtable)
6. Storage type: Hashtable
7.Best choice: To remove duplicate elements when order of insertion is mandatory
 */
package com.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset1 {

	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(1000);
		lhs.add("Akshay");
		lhs.add(1000);//will be discarded
		lhs.add(null);
		lhs.add(null);//will be discarded
		lhs.add(3.14);
		lhs.add('C');
		lhs.add(true);
		
		System.out.println("Printing LinkedHashSet:\n"+lhs);System.out.println();
		System.out.println("LinkedHashSet Size: "+lhs.size());System.out.println();
		System.out.println("Check wheter element is present in set or not? "+lhs.contains("Akshay"));System.out.println();
		lhs.remove(3);
		System.out.println("LinkedHas Set aftr removing element: Size: "+lhs.size()+" "+lhs);System.out.println();
		lhs.add("Rushay");
		System.out.println("LinkedhashSet After adding new element: "+lhs.size()+" "+lhs);System.out.println();
	
		
		System.out.println("*********************TRAVERSING LINKED HASH SET**************");
		System.out.println("1. USING FOREACH LOOP:");
		for(Object obj: lhs)
		{
			System.out.print(" "+obj);
		}
		System.out.println();
		System.out.println();
		
		
		Iterator itr=lhs.iterator();
		System.out.println("2. USING Iterator & while loop:");
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		
		lhs.clear();
		
		
	}

}
