package nikeeta;

public class RemovedublicateFrom {
 
	public static void main(String str[]) {
		String s = "nikeeta";
		s = s.toLowerCase();
		String s1 = "";
		for(int i=0; i<s.length(); i++) {
			int j ;
			for( j=0; j<s.length(); j++) { 
				if(s.charAt(i) == s.charAt(j)) {
					
				 break;
				}
				
			}
			
		if(i == j) {
				s1 +=s.charAt(i);
			}
		}
		System.out.println(s1);
	}
}
