package nikeeta;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "nikeeta";
String s2 = "keetani";

char c1[] = s1.toLowerCase().toCharArray();

char c2[] = s2.toLowerCase().toCharArray();



Arrays.sort(c1);
Arrays.sort(c2);

boolean status = Arrays.equals(c1,c2);

if(status) {
	System.out.println("Anagram String");
}
else {
	System.out.println("not Anagram String");
}
	}

}
