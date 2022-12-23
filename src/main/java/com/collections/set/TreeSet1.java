/*
1. Doesn’t allow duplicate
2. Null values: not allowed
3. Order of insertion- Ascending order.
4. No default capacity.
5. DS: Balanced tree
6. Storage type: Hashtable
7. Best Choice: To remove duplicate elements when order of insertion is Ascending order.
Note: we can store only homogeneous data
 */
package com.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args)
	{
		TreeSet trs=new TreeSet();
		trs.add(100);//Homogeneous object only
		trs.add(300);
		trs.add(500);
		trs.add(200);
		trs.add(400);
		
		System.out.println("Printing TREE SET: " +trs);//ascending order 
		System.out.println();
		
		trs.pollFirst(); //delete first element
		System.out.println("TreeSet After deleting(polling) first element: Size: "+trs.size()+" "+trs);
		System.out.println();
		
		trs.pollLast();//delete last element
		System.out.println("TreeSet After deleting(polling) last element: Size: "+trs.size()+" "+trs);
		System.out.println();
		
		System.out.println("Getting first element of Set: "+trs.first());
		System.out.println();
		
		System.out.println("Getting last element of Set: "+trs.last());System.out.println();
		
		System.out.println("*****************TRAVERSING TREE SET**************");
		Iterator itr=trs.iterator();
		System.out.println("1. USING While loop & Iterator");
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		System.out.println();
		
		System.out.println();
		System.out.println("1. USING foreach loop");
		for(Object obj: trs)
		{
			System.out.print(" "+obj);
		}
	}

}
