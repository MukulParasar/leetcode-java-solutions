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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>(inorderTraversal(root));
        ArrayList<Integer> sortedList = new ArrayList<>(deepCopyList(list));
        Collections.sort(sortedList);
        if (list.equals(sortedList)) {
            return true;
        }
        return false;
    }
    private List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root != null) {
            list.addAll(inorderTraversal(root.left));
            list.add(root.val);
            list.addAll(inorderTraversal(root.right));
        }
        return list;
    }
    private ArrayList<Integer> deepCopyList(ArrayList<Integer> originalList) {
        ArrayList<Integer> copiedList = new ArrayList<>();
        for (Integer item : originalList) {
            if (copiedList.contains(item)) {
                return copiedList;
            }
            copiedList.add(new Integer(item));
        }
        return copiedList;
    }
}