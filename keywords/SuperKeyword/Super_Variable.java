// Used to invoke parent class method
// It should be used if subclass contains the same method as parent class.
// It is used if method is overridden

 The super keyword refers to superclass (parent) objects.
 It is used to call superclass methods, and to access the superclass constructor.
 The most common use of the super keyword is to eliminate the confusion between superclasses and
subclasses that have methods with the same name.
 The super keyword in Java is a reference variable which is used to refer immediate parent class
object.


 class demo
 {
 void show()
 {
 System.out.println("Super class method");
 }
 }
 class Super_keyword extends demo{
 void show()
 {
 super.show();
 System.out.println("Sub class method");
 } 
public static void main(String args[]) {  
sample s1 = new sample();
 s1.show();
 }  
} 
