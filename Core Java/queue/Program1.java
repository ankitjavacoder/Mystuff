package queue;

import java.util.PriorityQueue;

public class Program1 {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(30);
		pq.add(100);
		pq.add(40);
		pq.add(20);
		pq.add(90);
		System.out.println("My array is " + pq);
	}

}
