package back;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back_1012 {
	/*
입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 
그 다음 줄부터 각각의 테스트 케이스에 대해 
첫째 줄에는 배추를 심은 배추밭의 가로길이 M(1 ≤ M ≤ 50)과 세로길이 N(1 ≤ N ≤ 50), 
그리고 배추가 심어져 있는 위치의 개수 K(1 ≤ K ≤ 2500)이 주어진다. 
그 다음 K줄에는 배추의 위치 X(0 ≤ X ≤ M-1), Y(0 ≤ Y ≤ N-1)가 주어진다.


	 */
	static Scanner sc = new Scanner(System.in);

	static int t, m, n;
	static int[][][] baechuArr;
	
	public static void main(String[] args) {
		
		// 테스트 케이스(경우의 수)
		int t = sc.nextInt();
		
		int[] result = new int[t];
		
		// 배추밭
		baechuArr = new int[t][][];
		Queue<Point> baechu = new LinkedList<Point>();
		
		
		// 배추밭의 위치
		for (int i = 0; i < t; i++) {
			
			// 배추밭 가로길이
			m = sc.nextInt();
			
			// 배추밭 세로길이
			n = sc.nextInt();
			
			// 배추밭의 배추 개수
			int k = sc.nextInt();
			baechuArr[i] = new int[m][n];
			
			// 배추 심기
			for (int j = 0; j < k; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				baechuArr[i][x][y] = 1;
				
				//배추 담기
				baechu.offer(new Point(x,y));
			}
			
			// 심은 배추 영역 개수 구하기
			while(!baechu.isEmpty()) {
				
				Point p = baechu.poll();
				
				int x = p.x;
				int y = p.y;
				
				if(baechuArr[i][x][y] == 1) {
					searchChu(i, x, y);
					result[i]++;
				}
			}
			
		}
		
		// 배추밭 보기용
		for(int[][] a:baechuArr) {
			for(int[] b: a) {
				for(int c: b)
					System.out.print(c+" ");
				System.out.println();
			}
			System.out.println("===============");
		}
		
		for(int res:result)
			System.out.println(res);
		
		
	}
	
	public static void searchChu(int i, int x, int y) {
		
		// 방향 좌표
		int[] crossX = {-1,1,0,0};
		int[] crossY = {0,0,-1,1};

		baechuArr[i][x][y] = 0;

		for (int j = 0; j < 4; j++) {
			int xx = x + crossX[j]; 
			int xy = y + crossY[j];
			if(xx >= 0 && xx < m && xy >= 0 && xy < n) {
				if(baechuArr[i][xx][xy] == 1) {
					System.out.println("들어온 좌표 : "+xx+", "+xy);
					searchChu(i, xx, xy);
				}
			} 
		}
		
	}
	
}
