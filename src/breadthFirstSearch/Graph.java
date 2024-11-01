package breadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	ArrayList<Node> nodes;
	int[][] matrix;

	Graph(int size) {
		nodes = new ArrayList<Node>();
		matrix = new int[size][size];
	}

	public void addNode(Node node) {
		nodes.add(node);
	}

	public void addEdge(int source, int dest) {
		matrix[source][dest] = 1;
	}

	public boolean checkEdge(int source, int dest) {
		if (matrix[source][dest] == 1) {
			return true;
		}
		return false;
	}

	public void print() {
		System.out.println("length:" + matrix.length);
		System.out.print("   ");
		for (Node node : nodes) {
			System.out.print(node.data + "  ");
		}
		System.out.println("\n");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(nodes.get(i).data + "  ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}

	public void BreadthFirstSearch(int source) {

		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[matrix.length];
		queue.offer(source);
		visited[source] = true;
		while (queue.size() != 0) {
			source = queue.poll();
			System.out.println(nodes.get(source).data + " = visited");
			for (int i = 0; i < matrix[source].length; i++) {
				if (matrix[source][i] == 1 && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
			;
		}
	}

}
