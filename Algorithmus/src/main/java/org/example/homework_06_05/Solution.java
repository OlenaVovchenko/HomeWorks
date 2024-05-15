package org.example.homework_06_05;

public class Solution {
    private TreeNode firstElement = null;
    private TreeNode secondElement = null;
    private TreeNode prevElement = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        traverse(root);

       int temp = firstElement.val;
        firstElement.val = secondElement.val;
        secondElement.val = temp;
    }

    private void traverse(TreeNode root) {
        if (root == null) return;

        traverse(root.left);

        if (firstElement == null && prevElement.val >= root.val) {
            firstElement = prevElement;
        }

        if (firstElement != null && prevElement.val >= root.val) {
            secondElement = root;
        }

        prevElement = root;

        traverse(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBSTHelper(TreeNode node, long lower, long upper) {
        if (node == null) return true;

        int val = node.val;
        if (val <= lower || val >= upper) return false;

        if (!isValidBSTHelper(node.right, val, upper)) return false;
        if (!isValidBSTHelper(node.left, lower, val)) return false;

        return true;
    }
}
