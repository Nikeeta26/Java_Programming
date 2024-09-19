// LinkedList :-
// it can contain duplicate elements.
// it maintain insertion order.
// it allows random access because it works on index basis.
// manupulation is little is slower because lots of bit shifting requires if any element is removed from array list.


import java.util.*;
public class sample
{
public static void main(String args[])
{
LinkedList<String> list=new LinkedList<String>();
list.add("Abc");
list.add("Lmn");
list.add("Pqr");
Iterator<String> itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
} 
}