 It allows us to store the null elements as well, but there should be only one null key.
 HashMap class implements the Map interface which allows us to store key and value pair

 HashMap contains values based on the key.
 HashMap contains only unique keys.
 HashMap may have one null key and multiple null values.
 HashMap maintains no order.

internaly build array od linkedList

import java.util.*;
public class sample
{
public static void main(String args[])
{
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(1,"Abc");
map.put(2,"qwerty");
map.put(3,"xyz");
map.put(4,"lmn");
for(Map.Entry m : map.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}
System.out.println(map.keySet());
}
}