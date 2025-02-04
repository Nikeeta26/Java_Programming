package nikeeta;

public class StackImplementUsingArray {
	private int arr [];
	private int top;
	private int capacity;
	StackImplementUsingArray(int size)
	{
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	//push
	    public void push(int data){
		if(isFull()) {
			System.out.println("stack is full"+ data);
			return;
		}
		arr[++top] = data;
	}
	    
	 //pop 
	    public int pop() {
	    	if(isEmpty()) {
	    		System.out.println("stack is empty");
	    		return -1;
	    	} 
	    	return arr[top--];
	    }
	    
	 //peek
	   public int peek() {
		   if(isEmpty()) {
			   System.out.println("stack is empty");
			   return -1;
		   }
		   return arr[top];
	   }
	// isFull
	public boolean isFull() {
		return top == capacity - 1;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return top == -1;
	}
	
	 public void display() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty.");
	            return;
	        }
	        System.out.print("Stack: ");
	        for (int i = 0; i <= top; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		StackImplementUsingArray stack = new StackImplementUsingArray(5);
		stack.push(2);
		stack.push(6);
		stack.push(7);
		
		stack.display();
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println(stack.isEmpty());

	}

}
