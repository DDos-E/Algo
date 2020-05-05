package back;

import java.util.Scanner;

public class Back_7579 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 활성화된 앱
		int n = sc.nextInt();
		// 확보해야하는 바이트
		int m = sc.nextInt();
		// n개의 앱들의 할당메모리
		int[] app = new int[n];
		// 비활성화의 비용
		int[] cost = new int[n];
		
		for (int i = 0; i < n; i++) {
			app[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			cost[i] = sc.nextInt();
		}
		
		
		
	}
}
