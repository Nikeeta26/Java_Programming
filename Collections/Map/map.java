 A map contains values on the basis of key, i.e. key and value pair.
 Each key and value pair is known as an entry.
 A Map contains unique keys.
 A Map is useful if you have to search, update or delete elements on the basis of a key

 A Map doesn't allow duplicate keys, but you can have duplicate values.
 HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow
any null key or value.

import java.util.*;
public class sample
{
public static void main(String args[])
{
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(101,"Abc");
map.put(102,"Lmn");
map.put(103,"Pqr");
for(Map.Entry m:map.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}
}
}
