 The Hashtable class implements a hash table, which maps keys to values.
 Any non-null object can be used as a key or as a value.
 It is similar to HashMap, but is synchronized.

 A Hashtable is an array of a list. Each list is known as a bucket.
 The position of the bucket is identified by calling the hashcode() method.
 Hashtable class contains unique elements.
 Hashtable class doesn't allow null key or value.


import java.util.*;
public class sample
{
public static void main(String args[])
{
Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
ht.put(10,"Abc");
ht.put(20,"Lmn");
ht.put(30,"Xyz");
ht.put(40,"Pqr");
for(Map.Entry m:ht.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}
}
}