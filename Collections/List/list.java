import java.util.*;

 In Java, a list interface is an ordered collection of objects in which duplicate values can be stored.

 List in Java provides the facility to maintain the ordered collection.

 We can also store the null elements in the list.

 The List interface is found in the java.util package and inherits the Collection interface.

              list 
                |
                |
   ArrayList   LinkedList   Vector
                              |
                              |
                            Stack




public class sample
{
public static void main(String args[])
{
List<String> list=new ArrayList<String>();
list.add("Abc");
list.add("Lmn");
list.add("Pqr");
list.add
(null);
for(String str:list) {
System.out.println
(str);
}
}
}