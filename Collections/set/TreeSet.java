 TreeSet is one of the most important implementations of the SortedSet interface in Java that
uses a Tree for storage.
 The ordering of the elements is maintained by a set using their natural ordering.
 The objects of the TreeSet class are stored in ascending order.

 TreeSet class contains unique elements only like HashSet.
 TreeSet class access and retrieval times are quiet fast.
 TreeSet class doesn't allow null element.
 TreeSet class maintains ascending order

import java.util.*;
public class sample
{
public static void main(String args[])
{
TreeSet<String> al=new TreeSet<String>();
al.add("Liam");
al.add("Noah");
al.add("Oliver");
al.add("Elijah");
Iterator<String> itr
=al.iterator();
while(itr.hasNext())
{
System.out.println
(itr.next());
}
}
}