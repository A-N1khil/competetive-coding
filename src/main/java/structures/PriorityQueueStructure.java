package structures;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueStructure {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(1);
		pq.offer(2);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);


		PriorityQueue<Integer> pqRev = new PriorityQueue<>(Collections.reverseOrder());

		pqRev.add(1);
		pqRev.offer(2);
		System.out.println(pqRev.peek());
		System.out.println(pqRev.poll());
		System.out.println(pqRev);

	}
}
