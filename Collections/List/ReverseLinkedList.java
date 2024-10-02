public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        LinkedList<Integer> li = new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);
        
        int arr[] = new int[li.size()];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = li.get(i);
        }
        
        li.clear();
        
        for(int i=arr.length-1; i>=0; i--) {
           li.add(arr[i]);
        }
        
        System.out.println(li);
    }

}