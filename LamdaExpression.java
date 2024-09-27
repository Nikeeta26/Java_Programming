Java Lambda Expression is a way to define 
an anonymous function or method that can be passed around as a value.

interface demo{
    void show();
}

public class LamdaExpression{
   public static void main(String args[]){
    demo d = () -> {
        System.out.println("hi i am annomous function");

     };

     d.show();
     //or 

     demo d = () -> System.out.println("hi i am annomous function");
     
     d.show();
 }
}