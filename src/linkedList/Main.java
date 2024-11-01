package linkedList;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> schools = new LinkedList<String>();
		schools.push("Welfare Academy");
		schools.push("KG");
		schools.push("Saheed Smrity");
		schools.push("Khulna High");
		schools.push("Jashore High");
		System.out.println(schools);
		schools.add(4, "Al-helal");
		schools.pop();
		schools.poll();
		schools.removeLast();
		System.out.println(schools);
		System.out.println(schools.peekFirst());
		System.out.println(schools.peekLast());

	}

}
