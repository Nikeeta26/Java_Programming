class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert a node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Detect cycle using Floyd’s Cycle Detection Algorithm
    public boolean hasCycle() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow pointer by 1 step
            fast = fast.next.next;   // Move fast pointer by 2 steps

            if (slow == fast) { // If they meet, cycle detected
                return true;
            }
        }
        return false; // No cycle
    }

    // Create a cycle manually (for testing)
    public void createCycle(int pos) {
        if (head == null) return;

        Node temp = head;
        Node cycleNode = null;
        int count = 0;

        while (temp.next != null) {
            if (count == pos) {
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }
        if (cycleNode != null) {
            temp.next = cycleNode; // Link last node to the cycle position
        }
    }
}

public class DetectCycle {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Cycle present? " + list.hasCycle()); // Output: false

        list.createCycle(2); // Creating cycle at node index 2 (0-based)

        System.out.println("Cycle present? " + list.hasCycle()); // Output: true
    }
}
