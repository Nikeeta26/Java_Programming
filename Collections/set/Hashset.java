 Java HashSet class is used to create a collection that uses a hash table for storage.
 The important points about Java HashSet class are: HashSet stores the elements by using a
mechanism called hashing.
 HashSet contains unique elements only.
 In hashing, the informational content of a key is used to determine a unique value, called its hash
code

 HashSet stores the elements by using a mechanism called hashing.
 HashSet contains unique elements only.
 HashSet allows null value.
 HashSet doesn't maintain the insertion order.
 HashSet is the best approach for search operations

import java.util.*;
public class sample
{
public static void main(String args[])
{
HashSet<String> s=new HashSet();

    s.add("Liam");
    s.add("Noah");
    s.add("Oliver");
    s.add("Elijah");

Iterator<String> i=s.iterator();

while(i.hasNext())
{
 System.out.println(i.next());
}
}
}