package org.example.homework_06_05;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(13);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(6); // Некорректное расположение
        root.left.right = new TreeNode(3); // Некорректное расположение

        Solution solution = new Solution();

        System.out.println("Is valid BST before recovery: " + solution.isValidBST(root));
        solution.recoverTree(root);
        System.out.println("Is valid BST after recovery: " + solution.isValidBST(root));
    }
}

