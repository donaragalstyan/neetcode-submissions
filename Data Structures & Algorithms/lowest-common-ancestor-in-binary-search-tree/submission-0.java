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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }

    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if ((p.val > root.val && q.val < root.val) || p.val < root.val && q.val > root.val) {
            return root;
        }

        if (p.val > root.val && q.val > root.val) {
            root = dfs(root.right, p, q);
        }

        if (p.val < root.val && q.val < root.val) {
            root = dfs(root.left, p, q);
        }

        return root;
    }
}
