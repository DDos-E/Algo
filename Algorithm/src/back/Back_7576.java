package back;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back_7576 {
/*
문제
창고에 보관되는 토마토들 중에는 잘 익은 것도 있지만, 아직 익지 않은 토마토들도 있을 수 있다. 보관 후 하루가 지나면, 익은 토마토들의 인접한 곳에 있는 익지 않은 토마토들은 익은 토마토의 영향을 받아 익게 된다. 하나의 토마토의 인접한 곳은 왼쪽, 오른쪽, 앞, 뒤 네 방향에 있는 토마토를 의미한다. 대각선 방향에 있는 토마토들에게는 영향을 주지 못하며, 토마토가 혼자 저절로 익는 경우는 없다고 가정한다. 철수는 창고에 보관된 토마토들이 며칠이 지나면 다 익게 되는지, 그 최소 일수를 알고 싶어 한다.

토마토를 창고에 보관하는 격자모양의 상자들의 크기와 익은 토마토들과 익지 않은 토마토들의 정보가 주어졌을 때, 며칠이 지나면 토마토들이 모두 익는지, 그 최소 일수를 구하는 프로그램을 작성하라. 단, 상자의 일부 칸에는 토마토가 들어있지 않을 수도 있다.

입력

첫 줄에는 상자의 크기를 나타내는 두 정수 M,N이 주어진다. M은 상자의 가로 칸의 수, N은 상자의 세로 칸의 수를 나타낸다. 단, 2 ≤ M,N ≤ 1,000 이다. 둘째 줄부터는 하나의 상자에 저장된 토마토들의 정보가 주어진다. 즉, 둘째 줄부터 N개의 줄에는 상자에 담긴 토마토의 정보가 주어진다. 하나의 줄에는 상자 가로줄에 들어있는 토마토의 상태가 M개의 정수로 주어진다. 정수 1은 익은 토마토, 정수 0은 익지 않은 토마토, 정수 -1은 토마토가 들어있지 않은 칸을 나타낸다. 

출력

여러분은 토마토가 모두 익을 때까지의 최소 날짜를 출력해야 한다. 만약, 저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력해야 하고, 토마토가 모두 익지는 못하는 상황이면 -1을 출력해야 한다.



 */
	static Scanner sc = new Scanner(System.in);

	static int[][] box;
	static boolean[][] boolBox;
	
	static int result = 0;
	static int[] crossX = {-1,1,0,0};
	static int[] crossY = {0,0,-1,1};

	public static void main(String[] args) {
		
		// 크기값
		int y = sc.nextInt();
		int x = sc.nextInt();
		
		// 1을 담을 배열
		Queue<Point> queue = new LinkedList<Point>();
		
		// 상자 크기 
		box = new int[x][y];
		boolBox = new boolean[x][y];
		
		// 값 담기
		for (int i = 0; i < box.length; i++)
			for (int j = 0; j < box[i].length; j++) 
				box[i][j] = sc.nextInt();
		
//		for(int[] ed:box) {
//			for(int eg:ed)
//				System.out.print(eg);
//			System.out.println();
//		}
				
		
		// 전체 순회
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				if(box[i][j] == 1) {
					queue.offer(new Point(i,j));
				}
			}
		}
		
		// 상태 변경
		while(!queue.isEmpty()) {
			Point point = queue.poll();
			for (int i = 0; i < 4; i++) {
				int xx = point.x + crossX[i];
				int xy = point.y + crossY[i];
				if(0 > xx || 0 > xy || xx >= x || xy >= y) {
					
				}else if(box[xx][xy] == 0) {
					box[xx][xy] = box[point.x][point.y] + 1;
					queue.offer(new Point(xx,xy));
				}
			}
		}

		// 전체 점검
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				if(box[i][j] == 0) {
					result = -1;
					break;
				}else {
					result = box[i][j] > result ? box[i][j]-1 : result;
				}
			}
			
			if(result == -1) break;
		}
//		for(int[] ed:box) {
//			for(int eg:ed)
//				System.out.print(eg);
//			System.out.println();
//		}

		
		System.out.println(result);
	}
}
