package leetcode.linkedlists;

public class DeleteMiddleNode {
	public ListNode deleteMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;

		// What if the List has a single element? Return null
		if (slow.next == null) {
			return null;
		}


		// Start traversing using Two Pointer method
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		// Delete the node
		prev.next = slow.next;

		return head;
	}

	public static void main(String[] args) {
		ListNode head = ListNode.createLinkedList(new int[]{1, 3, 4, 7, 1, 2, 6});

		DeleteMiddleNode deleteMiddleNode = new DeleteMiddleNode();
		deleteMiddleNode.deleteMiddle(head);

		ListNode.printList(head);

		ListNode head1 = ListNode.createLinkedList(new int[]{1, 2, 3, 4});
		deleteMiddleNode.deleteMiddle(head1);

		ListNode.printList(head1);

		ListNode head2 = ListNode.createLinkedList(new int[]{1, 2});
		deleteMiddleNode.deleteMiddle(head2);

		ListNode.printList(head2);
	}
}
