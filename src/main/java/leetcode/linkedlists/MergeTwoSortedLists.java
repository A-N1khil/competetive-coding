package leetcode.linkedlists;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		// Check for empty lists
		if (list1 == null && list2 == null) {
			return null;
		}

		if (list1 == null) {
			return list2;
		}

		if (list2 == null) {
			return list1;
		}

		// Set the first value
		ListNode head;
		if (list1.val < list2.val) {
			head = new ListNode(list1.val);
			list1 = list1.next;
		} else {
			head = new ListNode(list2.val);
			list2 = list2.next;
		}
		ListNode result = head;

		while (list1 != null && list2 != null) {
			ListNode temp;
			if (list1.val < list2.val) {
				temp = new ListNode(list1.val);
				list1 = list1.next;
			} else {
				temp = new ListNode(list2.val);
				list2 = list2.next;
			}
			head.next = temp;
			head = head.next;
		}
		// Run for list1
		while (list1 != null) {
			ListNode temp;
			temp = new ListNode(list1.val);
			list1 = list1.next;
			head.next = temp;
			head = head.next;
		}

		// Run for list2
		while (list2 != null) {
			ListNode temp;
			temp = new ListNode(list2.val);
			list2 = list2.next;
			head.next = temp;
			head = head.next;
		}

		return result;
	}

	public static void main(String[] args) {
		ListNode list1 = ListNode.createLinkedList(new int[]{1, 3, 4});
		ListNode list2 = ListNode.createLinkedList(new int[]{1, 2, 5, 6});

		MergeTwoSortedLists merge = new MergeTwoSortedLists();
		ListNode result = merge.mergeTwoLists(list1, list2);
		ListNode.printList(result);
	}
}
