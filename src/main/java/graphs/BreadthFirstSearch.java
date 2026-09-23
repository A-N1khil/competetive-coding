package graphs;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
	public void bfs(int start, List<List<Integer>> graph) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(start);
		boolean[] visited = new boolean[graph.size()];
		visited[start] = true;
		while (!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(node + " ");
			for (int neighbor : graph.get(node)) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
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
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		System.out.println("BFS starting from node 0:");
		bfs.bfs(0, graph);
		System.out.println("\nBFS starting from node 1:");
		bfs.bfs(1, graph);
	}
}
