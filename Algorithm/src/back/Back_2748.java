package back;

import java.util.Scanner;

public class Back_2748 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] fibo = {1,1};
		long result = 0;
		
		if(n <= 2) {
			if(n != 0) result = 1; 
			
		}else {
			for (int i = 3; i <= n; i++) {
				long sum = fibo[0]+fibo[1];
				result = sum;
				if(fibo[0]>=fibo[1])
					fibo[1] = sum;
				else
					fibo[0] = sum;
			}
			
		}
		
		System.out.println(result);
		
	}
}
