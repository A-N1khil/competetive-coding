package leetcode.trees.binarytree;

import trees.TreeNode;

public class RecoverBSTree {

	TreeNode firstNode;
	TreeNode secondNode;
	TreeNode previous;

	public void recoverTree(TreeNode root) {
		inOrderTraversal(root);

		int temp = firstNode.val;
		firstNode.val = secondNode.val;
		secondNode.val = temp;
	}

	public void inOrderTraversal(TreeNode current) {
		if (current == null) {
			return;
		}

		inOrderTraversal(current.left);

		if (previous != null && previous.val >= current.val) {
			// Violation of BST

			// If first violation, get first number to swap
			if (firstNode == null) {
				firstNode = previous;
			}
		}
		secondNode = current;
		previous = current;
		inOrderTraversal(current.right);
	}
}
