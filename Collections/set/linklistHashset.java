 The LinkedHashSet class of the Java collections framework provides functionalities of both the
hashtable and the linked list data structure.
 It implements the Set interface.
 Elements of LinkedHashSet are stored in hash tables similar to HashSet.

 LinkedHashSet class contains unique elements.
 LinkedHashSet class provides all optional set operation and permits null elements.
 LinkedHashSet class maintains insertion order

import java.util.*;
public class sample
{
public static void main(String args[])
{
LinkedHashSet<String> set=new LinkedHashSet();
set.add("Liam");
set.add("Noah");
set.add("Oliver");
set.add("Elijah");
Iterator<String> i=set.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}