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
    public int minDepth(TreeNode root) {
        if(root == null) {return 0;}
        Queue<TreeNode> store = new LinkedList<>();
        int depth= 1;
        store.offer(root);
        while(!store.isEmpty()) {
            int size = store.size();
            for(int i =0; i < size; i++) {
                TreeNode temp = store.poll();
                if (temp.right == null && temp.left ==null) return depth;
                if (temp.right != null) {
                    store.offer(temp.right);
                }
                if (temp.left != null) {
                    store.offer(temp.left);
                }
            }
            depth++;
        }
        return depth;
    }
}