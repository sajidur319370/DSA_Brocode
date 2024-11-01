package depthFirstSearch;

import java.util.ArrayList;

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

	public void DepthFirstSearch(int source) {

		boolean[] visited = new boolean[matrix.length];
		dfsHelper(source, visited);
	}

	private void dfsHelper(int source, boolean[] visited) {

		if (visited[source]) {

			return;

		} else {

			visited[source] = true;
			System.out.println(nodes.get(source).data + " = Visited");
		}
		for (int i = 0; i < matrix[source].length; i++) {
			if (matrix[source][i] == 1) {
				dfsHelper(i, visited);
			}

		}
		return;

	}

}
