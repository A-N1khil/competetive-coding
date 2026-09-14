package trees;

import java.util.ArrayDeque;
import java.util.Queue;

@SuppressWarnings("unused")
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public static TreeNode buildTree(Integer[] values) {
		if (values == null || values.length == 0 || values[0] == null) {
			return null;
		}
		TreeNode root = new TreeNode(values[0]);
		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		int i = 1;
		while (!queue.isEmpty() && i < values.length) {
			TreeNode current = queue.poll();
			// Left child
			if (i < values.length && values[i] != null) {
				current.left = new TreeNode(values[i]);
				queue.offer(current.left);
			}
			i++;
			// Right child
			if (i < values.length && values[i] != null) {
				current.right = new TreeNode(values[i]);
				queue.offer(current.right);
			}
			i++;
		}

		return root;
	}
}