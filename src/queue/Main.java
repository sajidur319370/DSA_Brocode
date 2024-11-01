package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> student = new LinkedList<String>();
		System.out.println(student.isEmpty());
		student.offer("Sajid");
		student.offer("Akbar");
		student.offer("Rahim");
		student.offer("Lamin");
		student.offer("yamal");
		System.out.println(student);
		System.out.println(student.size());
//		System.out.println(student.peek());
		System.out.println(student.poll());
		System.out.println(student.poll());
		System.out.println(student.isEmpty());
		System.out.println(student);
		System.out.println(student.size());

	}

}
