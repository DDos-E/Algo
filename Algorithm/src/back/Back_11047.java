package back;

import java.util.Scanner;

public class Back_11047 {

	public static Scanner sc = new Scanner(System.in);

	// 동전의 종류
	static int n;
	
	// 받을 금액
	static int k;
	
	// 동전 종류 배열
	static int[] a;
	
	
	static int result;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		k = sc.nextInt();
		a = new int[n];
		result = 0;
		
		for (int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
		

		for (int i = n-1; i >= 0; i--) {
			if(k == 0) break;
			
			int c = k/a[i];
			
			if(c >= 1) {
				result += c;
				k = k%a[i];
			}
		}
		
		System.out.println(result);
		
	}
	
}
