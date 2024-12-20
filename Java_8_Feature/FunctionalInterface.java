A functional interface in Java is an interface that contains
 only a single abstract method(SAM)

@FunctionalInterface  
interface sayable{  
    void say(String msg); 
    
    //but we write object method like =>
     String toString();
}  
public class FunctionalInterfaceExample implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Hello there");  
    }  
}  


