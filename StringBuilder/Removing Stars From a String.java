class Solution {
    public static String removeStars(String s) {
          StringBuilder result = new StringBuilder();
          for(char c : s.toCharArray()){
            if(c == '*'){
                result.deleteCharAt(result.length()-1);
            }
            else{
                result.append(c);
            }
          }

          return result.toString();
    }
    public static void main(String srt[]){
        String s = "nik***eeta**";
        String r = removeStars(s);
        System.out.println(r);
    }
}