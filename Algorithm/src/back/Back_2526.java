package back;

import java.util.Scanner;

public class Back_2526 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		
		int rightUp = 0;
		int leftUp = 0;
		int none = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x>y) rightUp++;
			if(x<y) leftUp++;
			if(x==y) none++;
		}
		
		
		int min = Math.min(none, Math.min(leftUp, rightUp)); 
		
		System.out.println(min);
	}
}
