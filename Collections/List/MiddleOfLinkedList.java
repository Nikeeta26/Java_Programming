package nikeeta;

import java.util.LinkedList;

public class MiddleOfLinkedList {

	    public static void main(String[] args) {
	        // Create a LinkedList and add some elements
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        linkedList.add(1);
	        linkedList.add(2);
	        linkedList.add(3);
	        linkedList.add(4);
	        linkedList.add(5);
	        linkedList.add(5);
	        
	        // linkedList.add(6); // Uncomment to test even number of nodes

	        // Find and print the middle element
	        Integer middleElement = findMiddle(linkedList);
	        if (middleElement != null) {
	            System.out.println("The middle element is: " + middleElement);
	        } else {
	            System.out.println("The linked list is empty.");
	        }
	        boolean s = linkedList.remove(middleElement);
	        System.out.println(linkedList);
	       
	    }

	    public static Integer findMiddle(LinkedList<Integer> linkedList) {
	        if (linkedList.isEmpty()) {
	            return null; // Return null if the list is empty
	        }

	        // Use two pointers to find the middle element
	        int slowIndex = 0; // Slow pointer
	        int fastIndex = 0; // Fast pointer

	        // Traverse the linked list
	        while (fastIndex < linkedList.size() && fastIndex + 1 < linkedList.size()) {
	            slowIndex++;       // Move slow pointer by one
	            fastIndex += 2;   // Move fast pointer by two
	        }

	        // The slow pointer is now at the middle element
	        return linkedList.get(slowIndex); // Return the middle element
	    }
	}
