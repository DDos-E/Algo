package back;

import java.util.Scanner;

public class Back_1965 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 상자 개수
		int n = sc.nextInt();
		
		// 상자 받은 순서
		int[] arr = new int[n];
		
		// 상자 순서 LIS 배열
		int[] lis = new int[n];
		
		// 최대값 구하기
		int max = 0;
		
        // 값 대입
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
        // 비교 For문
		for (int i = 0; i < arr.length; i++) {
			
            //기본 크기
            lis[i] = 1;
            
            //현재 들어가있는 값들만 비교
			for (int j = 0; j < i; j++) {
                
                // 현재의 값이 비교하는 값보다 크며, 그 비교값의 lis+1이 lis[i]보다 클 경우
				if(arr[i] > arr[j] && lis[i] < lis[j]+1) {
                    // 그 값을 lis[i] 에 담는다.
					lis[i] = lis[j]+1;
				}
			}
            
            //최대값 넣기
			max = lis[i] > max ? lis[i] : max;
		}
		
		System.out.println(max);
	}
}
