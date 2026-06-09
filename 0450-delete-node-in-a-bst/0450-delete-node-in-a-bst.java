/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        // searching
        if (root == null) return root;
        else if (key < root.val) root.left = deleteNode(root.left, key);
        else if (key > root.val) root.right = deleteNode(root.right, key);
        else {
            // data is found
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                // it has two children
                root.val = findSuccessor(root.right);
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }
    private int findSuccessor(TreeNode root) {
        int result = root.val;
        TreeNode temp = root;
        while (temp != null) {
            result = temp.val;
            temp = temp.left;
        }
        return result;
    }
}