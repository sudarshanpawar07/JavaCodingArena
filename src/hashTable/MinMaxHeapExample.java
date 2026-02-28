package hashTable;

import java.util.*;

public class MinMaxHeapExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		minHeap.add(10);
		minHeap.add(5);
		minHeap.add(20);
		minHeap.add(2);
		minHeap.add(8);

		System.out.println(minHeap.poll());
		System.out.println(minHeap.poll());
		System.out.println(minHeap.poll());
		System.out.println(minHeap.poll());

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		maxHeap.add(10);
		maxHeap.add(5);
		maxHeap.add(20);
		maxHeap.add(2);
		maxHeap.add(8);

		System.out.println(maxHeap.poll());
	}

}
