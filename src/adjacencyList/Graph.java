package adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
	ArrayList<LinkedList<Node>> alist;

	Graph() {
		alist = new ArrayList<LinkedList<Node>>();
	}

	public void addNode(Node node) {
		LinkedList<Node> currentList = new LinkedList<Node>();
		currentList.add(node);
		alist.add(currentList);

	}

	public void addEdge(int source, int dest) {
		Node destNode = alist.get(dest).get(0);
		alist.get(source).add(destNode);

	}

	public boolean checkEdge(int source, int dest) {
		Node destNode = alist.get(dest).get(0);
		LinkedList<Node> currentList = alist.get(source);
		for (Node node : currentList) {
			if (node == destNode) {
				return true;
			}
		}
		return false;
	}

	public void print() {
		for (LinkedList<Node> linkedList : alist) {
			for (Node node : linkedList) {
				System.out.print(node.data + "->");
			}
			System.out.println("\n");

		}

	}
}
