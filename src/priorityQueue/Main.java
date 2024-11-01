package priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		Queue<String> gpa = new PriorityQueue<String>(Collections.reverseOrder());
		gpa.offer("Alabama");
		gpa.offer("Blabama");
		gpa.offer("Aalabama");
		gpa.offer("Blaabama");

		while (!gpa.isEmpty()) {

			System.out.println(gpa.poll());

		}

	}

}
