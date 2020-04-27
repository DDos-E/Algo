package back;

import java.util.Scanner;

public class Back_1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		//회의실 수
		int num = sc.nextInt();
		sc.nextLine();
		
		//입력 회의시간
		int rArr[][] = new int[num][2];
		
		for(int i=0; i<num; i++) {
			String[] arr = sc.nextLine().split(" ");
			for(int j=0; j<arr.length; j++) {
				rArr[i][j] = Integer.parseInt(arr[j]);          
			}
		}
	}
}
