public class StackReverse{
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();
        
        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("Original Stack: " + stack);
        
        // Reversing the stack using Collections.reverse()
        Collections.reverse(stack);
        
        System.out.println("Reversed Stack: " + stack);

/********************** reverse ex  *********************************/

        Stack<Integer> stack = new Stack<>();
            
        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        int arr[] = new int[stack.size()];
        
        for(int i=0;  i<arr.length; i++) {
            
            arr[i] = stack.peek();
            
            stack.pop();
    }
        
        for(int i=0; i<arr.length; i++) {
            stack.push(arr[i]);
            //System.out.println(arr[i]);
        }
        System.out.println(stack);
    }

}