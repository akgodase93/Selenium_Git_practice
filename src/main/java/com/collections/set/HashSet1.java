/*
 HASHSET:
1. Doesn't allow duplicate values
2. Allow only 1 null value.
3. Order of insertion->random insertion
4. Storage type: Hashtable
5. No default capacity
6. DS: Hashtable
7. Best choice: To remove duplicate elements when order of insertion is not mandatory
 */
package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) 
	{
		HashSet has=new HashSet();
		has.add(1100);
		has.add("Akshay");
		has.add("Akshay");//will be discarded
		has.add(3.14f);
		has.add(null);//only one null value
		has.add(null);//will be discarded
		has.add(true);
		has.add('C');
		
		System.out.println("Printing Set: "+has);System.out.println();
		System.out.println("Check whether 'Akshay' is present in set or not? "+has.contains("Akshay"));System.out.println();
		System.out.println("Size of set: "+has.size());System.out.println();
		has.remove("Akshay");
		System.out.println("Set After removing 'Akshay' from the set: "+has);System.out.println();
		has.add("Rushay");
		System.out.println("Set After adding 'Rushay' in the set: "+has);System.out.println();
		
		System.out.println("*******************TRAVERSING SET************************");
		
		Iterator itr=has.iterator();
		
		System.out.println("1. USING WHILE LOOP");
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		System.out.println();
		System.out.println();
		
		System.out.println("2. Using foreach loop");	
		for(Object ob: has)
		{
			System.out.print(" "+ob);
		}
	}

}
