package graphs;

import java.util.List;

public class DepthFirstSearch {
	public void dfs(int start, List<List<Integer>> graph, boolean[] visited) {
		visited[start] = true;
		System.out.print(start + " ");
		for (int neighbor : graph.get(start)) {
			if (!visited[neighbor]) {
				dfs(neighbor, graph, visited);
			}
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> graph = List.of(
				List.of(1, 2),
				List.of(0, 3, 4),
				List.of(0, 5),
				List.of(1),
				List.of(1),
				List.of(2)
		);
		DepthFirstSearch dfs = new DepthFirstSearch();
		boolean[] visited = new boolean[graph.size()];
		System.out.println("DFS starting from node 0:");
		dfs.dfs(0, graph, visited);
		System.out.println("\nDFS starting from node 1:");
		visited = new boolean[graph.size()];
		dfs.dfs(1, graph, visited);
	}
}
