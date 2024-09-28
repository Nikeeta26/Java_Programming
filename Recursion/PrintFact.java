public class PrintNo {

    public static void PrintFact(int i,int n, int fact){
        if(i == n || n == 0){
           fact *= i;
           System.out.println(fact);
           return;
        }
        fact *= i;
       PrintSum(i+1, n, fact);
    }
       
//        if(n == 1) {
//         return 1;
//     }
    
//   int d =   PrintSum(n-1);
//   int s = n*d;
//   return s;


   public static void main(String[] args) {
      PrintSum(1, 5, 1);
   }

}