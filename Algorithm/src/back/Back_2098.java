package back;

import java.util.Arrays;
import java.util.Scanner;

public class Back_2098 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int map[][];
    static int d[][];
    static int MAX;
    
    public static void main(String[] args) {
    	
    	n = sc.nextInt();
    	
        // 무한대 |v - 1| * maxLength
    	MAX = (n-1) * 1000000;
    	
    	map = new int[n][n];
    	
    	// 1 << 1 = 2^1 = 10(2) = 2
    	// 1 << 4 = 2^4 =  10000(2) = 16
    	// 1 << 8 = 2^8 = 100000000(2) = 256
    	d = new int[n][1<<n];
    	
    	for (int i = 0; i < n; i++) {
    		Arrays.fill(d[i], MAX);
    		for (int j = 0; j < n; j++) 
    			map[i][j] = sc.nextInt();
    	}
    	
			
    	System.out.println(tsp(0, 1));
//    	for(int[] i : bit) {
//    		for(int j : i)
//    			System.out.println(j);
//    		System.out.println();
//    	}
	}
    

    public static int tsp(int current, int visit) {
    	
    	//visit과 관련된 연산은 전부 '1 << x'쉬프트연산으로 처리된다. 이점을 주의할것.
    	
    	// EX)) n = 4; (1 << n) - 1 = 10000
    	// 10000(2) = 16(10)
    	// 10000(2) - 1 = 1111(2) = 15(10)
    	
    	//모두 다 방문했을 경우
    	if(visit == (1 << n) - 1) {
    		System.out.println("나감 " + Integer.toBinaryString(visit) + " " +(1<<n));
    		if(map[current][0] == 0) return MAX;
    		return map[current][0];
    	}
    	
    	//현 위치에서 거리값이 계산된 값일 경우 리턴
    	if(d[current][visit] != MAX)
    		return d[current][visit];
    	
    	for (int i = 0; i < n; i++) {
    		// 방문한 적이 없는 경우	   && 길이 존재하는 경우 '!= 0'
			if((visit&(1<<i)) == 0 && map[current][i] != 0) { 
				System.out.println(Integer.toBinaryString(visit) + " " +Integer.toBinaryString(1<<i));
				System.out.println("들어옴");
				d[current][visit] = Math.min(d[current][visit], map[current][i]+tsp(i,visit|(1<<i)));
			}
			
		}
    		
    	return d[current][visit];
    }
    
}
