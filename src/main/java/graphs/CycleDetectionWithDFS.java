package graphs;

import java.util.List;

public class CycleDetectionWithDFS {
	static boolean hasCycle(int node, int parent, List<List<Integer>> graph, boolean[] visited) {
		visited[node] = true;
		for (int neighbor : graph.get(node)) {
			if (!visited[neighbor]) {
				if (hasCycle(neighbor, node, graph, visited)) {
					return true;
				}
			} else if (neighbor != parent) {

				return true;
			}
		}
		return false;
	}

	static boolean containsCycle(List<List<Integer>> graph) {
		boolean[] visited = new boolean[graph.size()];
		for (int node = 0; node < graph.size(); node++) {
			if (!visited[node]) {
				if (hasCycle(node, -1, graph, visited)) {
					return true;
				}
			}
		}
		return false;
	}
}
