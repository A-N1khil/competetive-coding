package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
	PriorityQueue<Integer> minHeap;
	PriorityQueue<Integer> maxHeap;

	public MedianFinder() {
		this.minHeap = new PriorityQueue<>();
		this.maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	}

	public void addNum(int num) {
		// First offer the number to maxHeap => we want to keep the smaller half of the numbers in maxHeap
		this.maxHeap.offer(num);

		// Then offer the largest element in maxHeap to minHeap => this would mean that the smallest element in
		// minHeap is greater than the largest element in maxHeap
		this.minHeap.offer(this.maxHeap.poll());

		// The difference in sizes should be at most 1
		if (this.minHeap.size() - this.maxHeap.size() > 1) {
			this.maxHeap.offer(this.minHeap.poll());
		}
	}

	public double findMedian() {
		return this.minHeap.size() == this.maxHeap.size() ? (this.minHeap.peek() + this.maxHeap.peek()) / 2.0 : this.minHeap.peek();
	}

}
