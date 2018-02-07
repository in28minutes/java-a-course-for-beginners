package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value2.length(),
				value1.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(10,
				new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat", "A",
				"B", "C", "D", "E", "F", "G"));
		queue.offer("Z");
		while (queue.peek() != null)
			System.out.println(queue.poll());
	}

}
