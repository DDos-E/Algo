package back;

import java.util.Scanner;

public class Back_2630 {

	static Scanner sc = new Scanner(System.in);

	static int n;
	static int[][] arr;

	static int white = 0;
	static int blue = 0;
	
	public static void main(String[] args) {
		
		// 입력부
		n = sc.nextInt();
		arr = new int[n+1][n+1];
		
		for (int i = 1; i <= n; i++) 
			for (int j = 1; j <= n; j++) 
				arr[i][j] = sc.nextInt();
			
		
		// 실행
		check(1, 1, n);
		
		// 출력
		//System.out.println("white = "+white);
		//System.out.println("blue = "+blue);
        System.out.println(white);
        System.out.println(blue);
	}
	
	// 실행부
	public static void check(int x, int y, int n) { 
		// 가장 첫번째 요소의 색상을 선정하기
		int color = arr[x][y];
	
		for (int i = x; i < x+n; i++) {
			for (int j = y; j < y+n; j++) {
				
				//색상이 다른게 발견될 경우
				if(arr[i][j] != color) {
			
					// 4방위 탐색
					// EX 1,1,8
					// For문에서 x(1)+n(4) = 5 or x(5)+(4) = 9
					// x(1) < 5 1~4 or x(5) < 9 5~8 반복하게 유도.
					
					check(x, y, n/2);			// 1, 1, 4
					check(x+n/2, y, n/2);		// 5, 1, 4
					check(x, y+n/2, n/2);		// 1, 5, 4
					check(x+n/2, y+n/2, n/2);	// 5, 5, 4
					
					
					//더이상 반복되지 않게 + 색상 추가하지 않게
					return;
				}
			}
		}
		
		//선정된 영역에서 모든 색이 일치할 경우
		if(color == 0) white++;
		else blue++;
	}
	
}
