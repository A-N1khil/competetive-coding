package leetcode.linkedlists;

@SuppressWarnings("all")
public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static ListNode createLinkedList(int[] arr) {
		ListNode head = new ListNode(arr[0]);
		ListNode cur = head;
		for (int i = 1; i < arr.length; i++) {
			cur.next = new ListNode(arr[i]);
			cur = cur.next;
		}
		return head;
	}

	public static void printList(ListNode head) {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.val + ( cur.next == null ? "" : " -> "));
			cur = cur.next;
		}
		System.out.println();
	}
}
