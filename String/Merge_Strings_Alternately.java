package nikeeta;

public class Merge_Strings_Alternately {

	public static void mergeString(String str1, String str2) {
		StringBuilder ans =  new StringBuilder();
		int i = 0;
		int j = 0;
		
		while(i<str1.length() && j<str2.length()) {
			ans.append(str1.charAt(i++));
			ans.append(str2.charAt(j++));
		}
		
		while(i<str1.length()) {
			ans.append(str1.charAt(i++));
		}
		
		while(j<str2.length()) {
			ans.append(str2.charAt(j++));
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "nik";
		String str2 = "mik";
		mergeString(str1,str2);
	}

}
