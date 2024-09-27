package nikeeta;

import java.util.LinkedList;

public class MethodReffence {
    // Non-static method 'show'
    public void show(String s) {
        System.out.println("hello nikeeta " + s);
    }

    public static void main(String[] args) {
        // Create an instance of MethodReffence
        MethodReffence n = new MethodReffence();

        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();
        list.add("Abc");
        list.add("mik");
        list.add("sik");

        // Using a lambda expression to print each element
        list.forEach(x -> System.out.println(x));

        // Using a method reference to the non-static show method
        list.forEach(n::show); // n is an instance of MethodReffence
    }
}
