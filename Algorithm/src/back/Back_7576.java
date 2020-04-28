package back;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back_7576 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 크기값
		int y = sc.nextInt();
		int x = sc.nextInt();
		
		// 방향 좌표
		int[] crossX = {-1,1,0,0};
		int[] crossY = {0,0,-1,1};

		// 1을 담을 배열
		Queue<Point> queue = new LinkedList<Point>();
		
		// 상자 크기 
		int[][] box = new int[x][y];
		
		// 결과값
		int result = 0;
		
		// 값 담기
		for (int i = 0; i < box.length; i++)
			for (int j = 0; j < box[i].length; j++) 
				box[i][j] = sc.nextInt();
		
		// 전체 순회 
		// 1만 찾아서 Queue에 담기
		for (int i = 0; i < box.length; i++) 
			for (int j = 0; j < box[i].length; j++) 
				if(box[i][j] == 1) 
					queue.offer(new Point(i,j));

		
		// 상태 변경
		while(!queue.isEmpty()) {
			Point point = queue.poll();
			
			// 인접요소 방문
			for (int i = 0; i < 4; i++) {
				int xx = point.x + crossX[i];
				int xy = point.y + crossY[i];
				
				// 배열을 넘어가는 경우
				if(0 > xx || 0 > xy || xx >= x || xy >= y) {
					
				// 상태변경할 값만 검색
				}else if(box[xx][xy] == 0) {
					//현재 값을 가지고 다른 곳을 방문시 +1을 한다.
					box[xx][xy] = box[point.x][point.y] + 1;
					
					//상태변경한 값을 Queue에 담기
					queue.offer(new Point(xx,xy));
					result = box[xx][xy]-1;
				}
			}
		}

		// 전체 점검
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				// 값이 바뀌지 않았다는게 검출될 경우
				if(box[i][j] == 0) {
					result = -1;
					break;
				}
			}
		}
		
		for(int[] ed:box) {
			for(int eg:ed)
				System.out.print(eg+"\t");
			System.out.println();
		}

		
		System.out.println(result);
	}
}
