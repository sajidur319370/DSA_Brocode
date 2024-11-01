package linkedListVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		long start_time;
		long end_time;
		long elapsed_time;
		LinkedList<Integer> l = new LinkedList<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 1000000; i++) {

			l.add(i);
			a.add(i);
		}

		start_time = System.nanoTime();
//		l.get(0);
//		l.get(50000);
//		l.get(99999);
//		l.remove(0);
//		l.remove(50000);
		l.remove(99999);

		end_time = System.nanoTime();
		elapsed_time = end_time - start_time;
		System.out.println("LinkedList:" + elapsed_time + "ns");
		System.out.println("========================================");

		start_time = System.nanoTime();
//		a.get(0);
//		a.get(50000);
//		a.get(99999);
//		a.remove(0);
//		a.remove(50000);
		a.remove(99999);
		end_time = System.nanoTime();
		elapsed_time = end_time - start_time;
		System.out.println("ArrayList:" + elapsed_time + "ns");

	}

}
