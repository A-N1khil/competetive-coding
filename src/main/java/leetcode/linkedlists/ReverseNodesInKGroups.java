package leetcode.linkedlists;

/**
 * @see <a href="https://leetcode.com/problems/reverse-nodes-in-k-group">Reverse Nodes in K groups</a>
 */
public class ReverseNodesInKGroups {

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode fakeHead = new ListNode(0);
		fakeHead.next = head;

		// Previous pointer
		ListNode prevGroupEnd = fakeHead;

		while (prevGroupEnd != null) {
			ListNode current = prevGroupEnd;
			for (int i = 0; i < k; i++) {
				current = current.next;
				if (current == null) {
					// All K groups are over
					return fakeHead.next;
				}
			}

			// Pointers for reversal
			ListNode groupStart = prevGroupEnd.next; // First node of current group
			ListNode nextGroupStart = current.next; // First node of next group
			// Disconnect the current group
			current.next = null;
			// Reverse and connect back
			prevGroupEnd.next = reverseHelper(groupStart);

			// After reversal the first group node will be connected to the next group
			groupStart.next = nextGroupStart;

			// Head over to the next group
			prevGroupEnd = groupStart;
		}

		return fakeHead.next;
	}

	ListNode reverseHelper(ListNode head) {
		ListNode prev = null, curr = head;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		ListNode head = ListNode.createLinkedList(new int[]{1, 2, 3, 4, 5});
		ReverseNodesInKGroups r = new ReverseNodesInKGroups();
		ListNode result = r.reverseKGroup(head, 2);
		ListNode.printList(result);
	}
}
