package leetcode.linkedlists;

public class ReversingLinkedList {

	private ListNode reverseLinkedList(ListNode head) {
		ListNode curr = head, prev = null, next;

		while (curr != null) {
			// Save the next node
			next = curr.next;
			// Reverse the current node
			curr.next = prev;
			// Move nodes one step ahead
			prev = curr;
			curr = next;
		}

		return prev;
	}


	public static void main(String[] args) {
		ListNode head = ListNode.createLinkedList(new int[]{1, 2, 3, 4, 5});
		ReversingLinkedList rll = new ReversingLinkedList();
		head = rll.reverseLinkedList(head);
		ListNode.printList(head);
	}

}
