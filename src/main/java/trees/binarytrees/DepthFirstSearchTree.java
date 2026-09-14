package trees.binarytrees;

import trees.TreeNode;

public class DepthFirstSearchTree {

	public void dfs(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " -> ");
		dfs(root.left);
		dfs(root.right);
	}

	public static void main(String[] args) {
		TreeNode root = TreeNode.buildTree(new Integer[] {3,9,20,null,null,15,7});
		DepthFirstSearchTree tree = new DepthFirstSearchTree();
		tree.dfs(root);
	}
}
