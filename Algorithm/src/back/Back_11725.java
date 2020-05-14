package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_11725 {

    static List<Integer>[] tree;
    static int[] parent;
    static boolean[] visit;
    
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	int n = Integer.parseInt(br.readLine());
    	tree = new ArrayList[n+1];
    	visit = new boolean[n+1];
    	parent = new int[n+1];
    	
    	for (int i = 1; i <= n; i++) 
			tree[i] = new ArrayList<Integer>();
    		
    	for (int i = 0; i < n-1; i++) {
    		StringTokenizer sti = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(sti.nextToken());
    		int y = Integer.parseInt(sti.nextToken());
    		
    		tree[x].add(y);
    		tree[y].add(x);
	    }
    	
    	br.close();
    	bfs(1);
    	
    	for (int i = 2; i <= n; i++) 
			bw.write(parent[i] + "\n");
		
    	bw.flush();
    	bw.close();
    		
	}
    
    public static void bfs(int target) {
    	Queue<Integer> queue = new LinkedList<Integer>();
    	queue.add(target);
    	visit[target] = true;
    	
    	while(!queue.isEmpty()) {
    		int cur = queue.poll();
    		for(int next : tree[cur]) {
    			if(!visit[next]) {
    				parent[next] = cur;
    				queue.add(next);
    				visit[next] = true;
    			}
    		}
    	}
    }
}