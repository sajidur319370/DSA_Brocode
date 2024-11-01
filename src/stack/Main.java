package stack;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> roll = new Stack<Integer>();
		System.out.println(roll.empty());

		roll.push(10);
		roll.push(12);
		roll.push(13);
		roll.push(14);
		System.out.println(roll);
		System.out.println(roll.search(10));
		System.out.println(roll.empty());
		roll.pop();
		roll.pop();
		System.out.println(roll);
		System.out.println(roll.empty());
	}

}
