package back;

import java.util.Scanner;

public class Back_2875 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 여학생 수
		int n = sc.nextInt();

		// 남학생 수
		int m = sc.nextInt();
		
		// 빠져야 하는 인원
		int k = sc.nextInt();
		
		int result = 0;
		
		while(m+n >= k+3 && n>=2 && m>=1){

			result++;
	        m--;
	        n -= 2;
		}
		
		System.out.println(result);
	}
}