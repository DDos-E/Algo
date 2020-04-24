package back;

import java.util.Scanner;

public class back1541 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int result = 0;
		// 입력받은 문자열을  '-' 를 기준으로 배열로 변환
		String[] strArr = sc.nextLine().split("\\-");

		
		for (int i = 0; i < strArr.length; i++) {
		
			//'-'를 만나기 전까지의 '+'를 모아서 초기화
			if(i == 0) {
				//스트링 전달
				result = result(strArr[i]);
				
			//'-'로 배열화된 값들을 전부 -로 변환시켜서 마이너스 값으로 전환 후 결과값에 대입
			}else {
				//스트링 전달
				int pp = result(strArr[i]);
				
				//값 마이너스화
				pp *= -1;
				
				//값 대입
				result += pp;
			}
		}
		System.out.println(result);
		
	}
	
	public static int result(String str) {
		int result = 0;
		//'+'를 기준으로 배열화 시킴
		String[] strArr = str.split("\\+");
		
		//기존에 '-','+'를 없어진 문자이기 때문에 단순 +연산으로 값을 넣은 후 돌려준다.
		for(String s : strArr) 
			result += Integer.parseInt(s);
		
		return result;
	}
	
	
}
