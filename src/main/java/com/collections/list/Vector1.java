/*
 VECTOR:
1. Duplicate are allowed in vector
2. Allows any no. of null values
3. Storage type: index
4. Order of insertion-maintain
5. Default capacity for Vector is 10
6. Incremental capacity= current capacity*2
7. Data structure: doubly
8. Best choice: retrieval operation (random access interface is implemented in arraylist & vector)
9. Worst choice: manipulation operation i.e. insertion in between Vector or delete ()
10. Vector is legacy class.
 */
package com.collections.list;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args)
	{
			Vector v=new Vector();
			v.add(100);
			v.add("Akshay");
			v.add(3.14f);
			v.add(null);
			v.add(true);
			v.add(100);
			
			System.out.println(v);
			System.out.println();
			System.out.println("************traversing Vector Using Iterator******************");
			Iterator it=v.iterator();
			while(it.hasNext())
			{
				System.out.print(" "+it.next());
			}
			System.out.println();System.out.println();
			System.out.println("*************Traversing Vector Using ListIterator**************");
			ListIterator ltr=v.listIterator();
			while(ltr.hasNext())
			{
				System.out.print(" "+ltr.next());
			}
			System.out.println();System.out.println();
			
			System.out.println("*************Traversing Vector Using for loop*****************");
			for(int i=0; i<v.size(); i++)
			{
				System.out.print(" "+v.get(i));
			}
			System.out.println();System.out.println();
			
			System.out.println("*************Traversing Vector Using foreach loop***************");
			for(Object o:v)
			{
				System.out.print(" "+o);
			}
			System.out.println();System.out.println();
			
			System.out.println("**************Traversing Vector using Enumeration****************");
			Enumeration e=v.elements();
			
			while(e.hasMoreElements())
			{
				System.out.print(" "+e.nextElement());
			}
			System.out.println();System.out.println();
	}

}
