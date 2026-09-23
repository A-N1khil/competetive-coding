package leetcode.trees.binarytree;

import leetcode.trees.Node;

import java.util.ArrayDeque;
import java.util.Deque;

public class PopulatingNextRightPointers {
	public Node connect(Node root) {
		Deque<Node> queue = new ArrayDeque<>();
		queue.add(root);
		Node prevNode = null;
		while (!queue.isEmpty()) {
			prevNode = null;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Node node = queue.poll();
				if (prevNode != null) {
					node.next = prevNode.next;
				}
				prevNode = node;
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
		}
		return root;
	}
}
