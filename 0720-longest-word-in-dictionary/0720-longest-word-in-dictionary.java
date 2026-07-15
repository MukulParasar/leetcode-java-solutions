class Solution {
    class Node {
        Node[] children = new Node[26];
        String word;
    }
    Node root = new Node();
    String res = "";
    void insert(String word) {
        Node curr = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (curr.children[idx] == null) curr.children[idx] = new Node();
            curr = curr.children[idx];
        }
        curr.word = word;
    }
    public String longestWord(String[] words) {
        for (String word : words) {
            insert(word);
        }
        helper(root);
        return res;
    }
    void helper(Node curr) {
        if (curr != root && curr.word == null) return;
        if (curr.word != null && curr.word.length() > res.length()) res = curr.word;
        for (int i = 0; i < 26; i++) {
            if (curr.children[i] != null) helper(curr.children[i]);
        }
    }
}