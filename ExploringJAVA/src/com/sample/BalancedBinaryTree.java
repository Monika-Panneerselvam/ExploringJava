package com.sample;

public class BalancedBinaryTree {

	// Definition for a binary tree node
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	// Main method to check if tree is height-balanced
	public static boolean isBalanced(TreeNode root) {
		return checkHeight(root) != -1;
	}

	// Helper method that returns height if balanced, or -1 if not
	private static int checkHeight(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int leftHeight = checkHeight(node.left);
		if (leftHeight == -1)
			return -1; // Left subtree not balanced

		int rightHeight = checkHeight(node.right);
		if (rightHeight == -1)
			return -1; // Right subtree not balanced

		if (Math.abs(leftHeight - rightHeight) > 1) {
			return -1; // Current node not balanced
		}

		// Return height of subtree
		return Math.max(leftHeight, rightHeight) + 1;
	}

	// Example usage
	public static void main(String[] args) {

		TreeNode rootNotBalancedTree = new TreeNode(1);
		rootNotBalancedTree.left = new TreeNode(2);
		rootNotBalancedTree.right = new TreeNode(3);
		rootNotBalancedTree.left.left = new TreeNode(4);
		rootNotBalancedTree.left.right = new TreeNode(5);
		rootNotBalancedTree.left.left.left = new TreeNode(6);

		System.out.println(isBalanced(rootNotBalancedTree) ? "Tree is balanced" : "Tree is NOT balanced");
		
		TreeNode rootBalancedTree = new TreeNode(1);
		rootBalancedTree.left = new TreeNode(2);
		rootBalancedTree.right = new TreeNode(3);
		rootBalancedTree.left.left = new TreeNode(4);
		rootBalancedTree.left.right = new TreeNode(5);

		System.out.println(isBalanced(rootBalancedTree) ? "Tree is balanced" : "Tree is NOT balanced");
	}
}
