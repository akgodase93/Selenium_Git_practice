/*
 LINKEDLIST:
1. Duplicate are allowed in Arraylist
2. Allows any no. of null values
3. Order of insertion-maintain
4. Storage type: index
5. No Default capacity in linkedlist
6. Data structure: linear
7. Best choice: manipulation operation i.e. insertion in between linkedlist or delete ()
8. Worst choice: retrieval operation (random access interface is not implemented)
 */
package com.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(1100);
		ll.add("Akshay");
		ll.add(3.14);
		ll.add('A');
		ll.add(null);
		ll.add(true);
		ll.add(null);
		
		System.out.println("Printing LinkedList:");
		System.out.println(ll+"\n");
		
		System.out.println("Size of LinkedList: "+ll.size()+"\n");
		
		System.out.println("Adding New Element in LinkedList:");
		ll.add(3,'C');
		System.out.print("Printing LinkedList After Insertion:");
		System.out.print("Size:"+ll.size()+" "+ll);
		System.out.println();
		System.out.println();
		System.out.println("Removing element from LinkedList: ");
		ll.remove(3);
		System.out.println("Linked List after removing element: Size:"+ll.size()+" "+ll+"\n");
		
		System.out.println("Updating element In LinkedList: ");
		ll.set(4, "not null");
		System.out.println("Linked List After Updation: Size:"+ll.size()+" "+ll);
		System.out.println();
		
		System.out.println("1.Print LinkedList using for loop");
		for(int i=0; i<ll.size(); i++)
		{
			System.out.print(" "+ll.get(i));
		}
		System.out.println();
		System.out.println();
		
		System.out.println("2.Print LinkedList using foreach loop");
		for(Object ob: ll)
		{
			System.out.print(" "+ob);
		}
		System.out.println();
		System.out.println();
		
		Iterator itr=ll.iterator();
		System.out.println("3.Print LinkedList using while loop & Iterator");
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		System.out.println();
		System.out.println();
		
		ListIterator ltr=ll.listIterator();
		System.out.println("4.Print LinkedList using while loop & ListIterator");
		while(ltr.hasNext())
		{
			System.out.print(" "+ltr.next());
		}
		System.out.println();
		
	}
}
