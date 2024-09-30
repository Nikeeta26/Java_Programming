package nikeeta;

import java.util.HashSet;

public class LogestSubString {
	 public static String longestSubstring(String s) {
		 int r=0 ,l = 0, maxLength=0,start = 0;
		 HashSet<Character> h = new HashSet<>();
		 while(r < s.length()) {
			 if(!h.contains(s.charAt(r))) {
				 h.add(s.charAt(r));
	                r++;
	                if (r - l > maxLength) {
	                    maxLength = r - l;
	                    start = l;
	                }

			 }
			 else {
				 h.remove(s.charAt(l));
				 l++;
			 }
		 }
		return s.substring(start, start+l);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "nikeeta";
System.out.println(longestSubstring(s));

   /**********************   or   ******************************/  

            String s = "nikeeta";
         
         char[] c = s.toCharArray();
         
         LinkedHashSet<Character> h = new LinkedHashSet<>();
         
         for(int i=0; i<s.length(); i++) {
       	  
       	  char p = c[i];
       	  
       	  if(!h.contains(p)) {
       		  h.add(p);
       	  }
         }
         
         System.out.println(h);
         
         Iterator<Character> i = h.iterator();
         
        while(i.hasNext()) {
       	 String m = i.next().toString();
       	 System.out.print(m);
        }


	}

}
