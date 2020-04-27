package back;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back_11724 {

	static Scanner sc = new Scanner(System.in);
	
	// 정점의 개수
	static int n = sc.nextInt();
	// 간선의 개수
	static int m = sc.nextInt();
	
	static int result = 0;
	
	static int[][] arr = new int[n+1][n+1];
	static boolean[] nBool = new boolean[n+1];

	static Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) {
        
        for(int i=1;i<=m;i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	arr[x][y] = 1;
        	arr[y][x] = 1;
        }
        
        for (int i = 1; i <= arr.length; i++) {
        	if(!nBool[i])
				for (int j = 1; j <= arr.length; j++) {
					if(arr[i][j] == 1) {
						search(i);
						result++;
					}
				}
		}
	}
	
	public static void search(int point) {
		nBool[point] = true;
		queue.offer(point);
		
		while(!queue.isEmpty()) {
			
			
		}
		
	}
}
