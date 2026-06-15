package structures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeStructure {
	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<>();

		deque.add(1); // [1]
		deque.offer(2); // [1, 2]

		deque.addFirst(3); // [3, 1, 2]
		deque.addLast(4); // [3, 1, 2, 4]

		System.out.println(deque.getFirst()); // 3
		System.out.println(deque.getLast()); // 4

		System.out.println(deque.pop()); // 3, deque becomes [1, 2, 4]
		System.out.println(deque.poll()); // 1, deque becomes [2, 4]
		System.out.println(deque.pollFirst()); // 2, deque becomes [4]

		deque.offerLast(5); // [4, 5]
		System.out.println(deque.pollLast()); // 5, deque becomes [4]

		deque.clear();
		System.out.println(deque.isEmpty()); // true

		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);

		for (Integer integer : deque) {
			System.out.println(integer);
		}
		// [1, 2, 3, 4]

		for (Iterator<Integer> iterator = deque.descendingIterator(); iterator.hasNext();) {
			Integer integer = iterator.next();
			System.out.println(integer);
		}
		// [4, 3, 2, 1]

	}
}
