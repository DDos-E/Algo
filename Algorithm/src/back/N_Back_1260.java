package back;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N_Back_1260 {

	static Scanner sc = new Scanner(System.in);
	
	/*
	--문제--
	그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
	단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 
	정점 번호는 1번부터 N번까지이다.
	
	--입력--
	첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 
	다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 
	어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 
	입력으로 주어지는 간선은 양방향이다.
	 */
	// 정점의 개수
	static int n = sc.nextInt();
	static boolean[] boolN = new boolean[n] ;
	// 간선의 개수
	static int m = sc.nextInt();
	// 탐색을 시작할 번호
	static int i = sc.nextInt()-1;
	
	static int index = 0;
	// 정점과 간선을 나타낼 2차원배열 선언
	static int[][] intArr = new int[n][n];
	static boolean[][] boolArr = new boolean[n][n];
	// 결과를 출력할 배열 선언
	static int[][] resultArr = new int[2][n];
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) {

		
		// 각 정점별 간선 
		for (int j = 0; j < m; j++) {
			int nn = sc.nextInt()-1;
			int mm = sc.nextInt()-1;
			intArr[nn][mm] = 1;
			intArr[mm][nn] = 1;
		}
		
		// DFS
		for (int j2 = 0; j2 < n; j2++) {
			dfsSearch(i,j2);
		}

		// 확인용 출력문
		for(int[] i:intArr) {
			for(int j:i)
				System.out.print(j);
			System.out.println();
		}
		
		// DFS 결과 출력
		for(int i:resultArr[0])
			if(i != 0)
				System.out.print(i+" ");
		
		System.out.println();
		
		// Boolean 지도 초기화, index 초기화
		boolN = new boolean[n] ;
		boolArr = new boolean[n][n];
		index = 0;
		
		// BFS
		queue.add(i);
		for (int i = 0; i < args.length; i++) {
			
			
		}
		while(!queue.isEmpty()) {
			
			int j1 = queue.poll();
			bfsSearch(j1);
		}
		
		// BFS 결과 출력
		for(int i:resultArr[1])
			if(i != 0)
				System.out.print(i+" ");
	}
	
	public static void dfsSearch(int j1, int j2) {
		
		//첫 방문일 경우 체크 후 결과값에 담기
		if(!boolN[j1]) {
			boolN[j1] = true;
			resultArr[0][index++] = j1+1;
		}
		
		// 방문하지 않은 정점일 경우
		if(!boolN[j2]) {

			// 정점과 정점이 연결되어있으며, 그 정점을 이용하지 않았을 경우
			if(intArr[j1][j2] != 0 && !boolArr[j1][j2]) {

				// 정점을 이용했다고 처리해주기
				boolArr[j1][j2] = true;
				boolArr[j2][j1] = true;
				
				// 방문한 정점에서 새로운 정점을 찾는 재귀함수 
				for (int i = 0; i < n; i++) {
					dfsSearch(j2, i);
				}
			}
		}
	}
	
	public static void bfsSearch(int j1) {
		
		//첫 방문일 경우 체크 후 결과값에 담기
		if(!boolN[j1]) {
			boolN[j1] = true;
			resultArr[1][index++] = j1+1;
		}
		for (int i = 0; i < n; i++) {
//			if(intArr[j1][i] != 0 && !boolArr[j1][j2]) {
//				queue.add(i);
//			}
		}
		
		// 정점과 정점이 연결되어있으며, 그 정점을 이용하지 않았을 경우
//		if(intArr[j1][j2] != 0 && !boolArr[j1][j2]) {
			// BFS전용 처리
//			boolN[j2] = true;
//			resultArr[1][index++] = j2+1;

			// 정점을 이용했다고 처리해주기
//			boolArr[j1][j2] = true;
//			boolArr[j2][j1] = true;
//		}
		
		
		
	}
		
	
}
