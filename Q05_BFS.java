import java.util.ArrayDeque;

public class Q05_BFS {
    int[][] adjMatrix;
    int numVertices;

        Q05_BFS(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int i = 0; i < numVertices; i++) {
                if (adjMatrix[currentVertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Q05_BFS graph = new Q05_BFS(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        System.out.println("Breadth First Traversal (starting from vertex 2): ");
        graph.bfs(2);
    }
}
