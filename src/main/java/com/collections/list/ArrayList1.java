package com.collections.list;
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayList1 
{
	public static void main(String[] args) 
	{
			ArrayList ar=new ArrayList();
			ar.add(100);
			ar.add("Akshay");
			ar.add(3.14f);
			ar.add('C');
			ar.add(true);
			ar.add(null);
			
			System.out.println("***************ArrayList Print*****************");
			System.out.println(ar);
			System.out.println("Array list size: "+ar.size());
			System.out.println("Index of array element 'C':"+ar.indexOf('C'));
			System.out.println("Check whether list is empty or not? "+ar.isEmpty());
			System.out.println("Check element 'Akshay' is present in list or not ? "+ar.contains("Akshay"));
			System.out.println("Getting value of 3rd index: "+ar.get(3));
			System.out.println("***************Adding New Element In Between ArrayList at 2nd index*****************");
			ar.add(2,"Rutuja");
			
			System.out.println("Element 'Rutuja' added in Array List:"+ar);
			System.out.println("***************Removing Element from ArrayList at 2nd index*****************");
			ar.remove(2);
			System.out.println("Element Removed from list: "+ar);
			
			System.out.println("Adding null duplicate values in Array list:");
			ar.add(4,null);
			System.out.println("Duplicate null value added: "+ar);
			
			System.out.println("Checking last index of 'null' :"+ar.lastIndexOf(null));
			
			System.out.println("Modifying element of list:");
			ar.set(1,"Rushay");
			System.out.println("List after modification: "+ar);
			
			System.out.println("********Traversing Array List *******************");
			System.out.println("************1.Using ListIterator & while loop*****************");
			ListIterator li=ar.listIterator();
			while(li.hasNext())
			{
				System.out.print(" "+li.next());
			}
			
			System.out.println();
			System.out.println("************2.Using for loop*********************");
			for(int i=0; i<ar.size(); i++)
			{
				System.out.print(" "+ar.get(i));
			}
			System.out.println();
			
			System.out.println("************2.Using for each loop*****************");
			for(Object o: ar)
			{
				System.out.print(" "+o);
			}
	}

}
