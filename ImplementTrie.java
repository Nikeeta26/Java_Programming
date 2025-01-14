class Trie {

    private TrieNode root;

    // TrieNode represents each character in the trie.
    private class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26];  // 26 letters in the alphabet
            isEndOfWord = false;
        }
    }

    // Constructor to initialize the trie
    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into the trie
    public void insert(String word) {
        TrieNode current = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';  // Assuming the word contains only lowercase English letters

            // If the child node does not exist, create it
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            // Move to the next node
            current = current.children[index];
        }

        // Mark the end of the word
        current.isEndOfWord = true;
    }

    // Search for a word in the trie
    public boolean search(String word) {
        TrieNode current = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            // If the child node does not exist, the word is not in the trie
            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        // Return true if we reached the end of the word
        return current.isEndOfWord;
    }

    // Check if there is a word in the trie that starts with the given prefix
    public boolean startsWith(String prefix) {
        TrieNode current = root;

        for (char c : prefix.toCharArray()) {
            int index = c - 'a';

            // If the child node does not exist, no word starts with the prefix
            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        return true;
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // return True
        System.out.println(trie.search("app"));     // return False
        System.out.println(trie.startsWith("app")); // return True
        trie.insert("app");
        System.out.println(trie.search("app"));     // return True
    }
}


/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */