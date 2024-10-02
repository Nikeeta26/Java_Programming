In Java, a stack is a data structure that follows the Last In,
 First Out (LIFO) principle.

The Stack class in Java is a part
of the Java Collection Framework and is a subclass of Vector, 
which means it inherits methods from Vector and implements some 
additional methods specific to stack operations.

Here are some important points about the Stack class in Java's collection framework:

1. LIFO Principle
The stack operates on the LIFO (Last In, First Out) principle,
 meaning the last element added to the stack will be the first one to be removed.
This behavior is crucial for scenarios like expression evaluation,
function call management (in recursion), and undo mechanisms in editors.

2. Stack Declaration
The Stack class is available in the java.util package.

operations
   1. push  O(1)
   2. pop   O(1)
   3. peek   O(1)  //get 1st element

   import java.util.*;
public class sample
{
public static void main(String args[])
{
    Stack<Integer> s = new Stack<>();
 
    s.push(4);
    s.push(4);
    s.push(4);
    s.push(4);
    s.push(4);

    while(!s.isEmpty){
        System.out.println(s.peek());
        s.pop();
    }
}
}