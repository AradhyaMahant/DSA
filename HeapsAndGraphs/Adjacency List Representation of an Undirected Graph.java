import java.util.LinkedList;
public class GraphList {
	
		LinkedList<Integer> []adj ;
		int V;
		
		public GraphList(int nodes) {
			this.adj = new LinkedList[nodes];
			this.V=nodes;
			for(int i=0;i<nodes;i++) {
				adj[i] = new LinkedList<>();
			}
		}
		
		public void addEdge(int u,int v) {
			adj[u].add(v);
			adj[v].add(u);
		}
	
		
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			for(int v=0;v<V;v++) {
				sb.append(v +": ");
				for(int w: adj[v]) {
					sb.append(w + " ");
				}
				sb.append("\n");
			}
			return sb.toString();
		}
		
		
		public static void main(String args[]) {
			GraphList gl = new GraphList(4);
			gl.addEdge(0, 1);
			gl.addEdge(1, 2);
			gl.addEdge(2, 3);
			gl.addEdge(3, 0);
			System.out.println(gl);
		}
}
