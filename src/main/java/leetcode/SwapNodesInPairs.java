package leetcode;

public class SwapNodesInPairs {

	public ListNode swapPairs(ListNode head) {

		ListNode answer = new ListNode();
		ListNode runner = answer;

		if (head == null) {
			return null;
		}

		while (head != null) {
			if (head.next != null) {
				runner.val = head.next.val;
				runner.next = new ListNode(head.val, null);
				if (head.next.next != null) {
					runner.next = new ListNode();
				}
				runner = runner.next.next;
				head = head.next.next;
			} else {
				runner.val = head.val;
				head = head.next;
			}
		}
		return answer;

	}
}
