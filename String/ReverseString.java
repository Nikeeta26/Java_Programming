package nikeeta;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "nikreeta";
		String s = " ";
		for(int i=str.length()-1; i>0; i--){
			
			s += str.charAt(i);
		}
		System.out.println(s);
		
	}

}
