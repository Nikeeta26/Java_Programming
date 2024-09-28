public class Nopower {

	public int power(int x, int n) {
		if(n ==0) {
			return 1;
		}
		if(x == 0) {
			return 0;
		}
		
		
		int d = power(x,n-1);
		
		int f = d*x;
		return f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PwerOfX p = new PwerOfX();
		int r = p.power(2,2);
		System.out.println(r);
	}

}
