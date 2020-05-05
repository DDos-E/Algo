package back;

import java.util.Scanner;

public class Back_2798 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 입력부
		int n = sc.nextInt();		// 카드 수량
		int m = sc.nextInt();		// 목표값
		int[] card = new int[n];	// 카드 배열
		
		
		for (int i = 0; i < n; i++) 
			card[i] = sc.nextInt();
		
		// 근접값 담을 변수
		int result = m;
		
		// For문은 중복을 줄이고자함
		// card[i] card[i+1] card[i+2] 
		for (int i = 0; i < card.length-2; i++) {
			for (int j = i+1; j < card.length; j++) {
				for (int j2 = j+1; j2 < card.length; j2++) {
					
					// 근사값 담기
					int value = m - (card[i]+card[j]+card[j2]);
					
					// 목표값에 도달할 경우 바로 종료
					if(value == 0) {
						System.out.println(m);
						return;
						
					// 근사값이 목표값을 초과하지 않으며 기존의 값보다 작을경우 근사값으로 저장
					}else if(value >= 0 && result > value){
						result = value;
					}
					
				}
			}
		}
		
		System.out.println(m-result);
		
	}	
}
