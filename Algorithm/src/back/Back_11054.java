package back;

import java.util.Scanner;

public class Back_11054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 수열의 크기
		int n = sc.nextInt();
		
		// 수열
		int[] arr = new int[n];
		
		// 선행 /후행 LIS 배열
		int[] fLis = new int[n];
		int[] bLis = new int[n];
		
		// lis의 최대값
		int max = 0;
		
        // 값 대입
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
        // 선행 Lis For문
		for (int i = 0; i < arr.length; i++) {
			
            //기본 크기
            fLis[i] = 1;
            
            //현재 들어가있는 값들만 비교
			for (int j = 0; j < i; j++) {
                
                // 현재의 값이 비교하는 값보다 크며, 그 비교값의 lis+1이 lis[i]보다 클 경우
				if(arr[i] > arr[j] && fLis[i] < fLis[j]+1) {
                    // 그 값을 lis[i] 에 담는다.
					fLis[i] = fLis[j]+1;
				}
			}
		}
		
		// 후행 Lis For문
		for (int i = n-1; i >= 0; i--) {
			
			//기본 크기
			bLis[i] = 1;
			
			//현재 들어가있는 값들만 비교
			for (int j = n-1; j >= i; j--) {
				
				// 현재의 값이 비교하는 값보다 크며, 그 비교값의 lis+1이 lis[i]보다 클 경우
				if(arr[i] > arr[j] && bLis[i] < bLis[j]+1) {
					// 그 값을 lis[i] 에 담는다.
					bLis[i] = bLis[j]+1;
				}
			}
		}

//		for(int i : fLis)
//			System.out.print(i);
//		System.out.println();
//		for(int i : bLis)
//			System.out.print(i);
//		System.out.println();
		
		// Lis 최고값 찾기
		for (int i = 0; i < arr.length; i++) {
			int sum = fLis[i] + bLis[i];
			max = sum > max ? sum : max;
//			System.out.print(fLis[i] + " " + bLis[i] +" / ");
		}
//		System.out.println();
		System.out.println(max-1);
	}
}
