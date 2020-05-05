package back;

import java.util.Scanner;

public class Back_2579 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 입력부
		int[] n = new int[sc.nextInt()];
		
		int temp = 1;
		int result = 0;
		
		for (int i = 0; i < n.length; i++) 
			n[i] = sc.nextInt();
		
		for (int i = n.length-1; i > 0; i--){
			
			if(i == n.length-1) {
				result += n[i];
			}else if(n[i] > n[i-1]) {
				result += n[i];
				temp++;
				if(temp % 2 == 0)
					i--;
			}
		}
		
		
		System.out.println(result);
		
	}
	
}
