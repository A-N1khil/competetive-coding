package leetcode.trees.binarytree;

import trees.TreeNode;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {

		// Both nodes should be null together
		// Check this condition first, because the second condition will override the first one
		if (p == null && q == null) {
			return true;
		}

		// If either one is null; not same
		if (p == null || q == null) {
			return false;
		}

		// Both have values now, check for equality
		if (p.val != q.val) {
			return false;
		}

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
