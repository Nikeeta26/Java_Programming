import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        
        // Start with room 0
        queue.add(0);
        visited[0] = true;
        
        while (!queue.isEmpty()) {
            int currentRoom = queue.poll();
            
            // Visit all keys in the current room
            for (int key : rooms.get(currentRoom)) {
                if (!visited[key]) {
                    visited[key] = true; // Mark as visited
                    queue.add(key); // Add to queue to explore later
                }
            }
        }
        
        // Check if all rooms have been visited
        for (boolean hasVisited : visited) {
            if (!hasVisited) {
                return false;
            }
        }
        return true;
    }
}
