package adjacencyMatrix;

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

}
