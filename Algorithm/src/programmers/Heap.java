package programmers;

import java.util.*;


public class Heap {

	public static void main(String[] args) {
		ss();
	}
	public static void ss() {
		java.util.PriorityQueue<Integer> priority = new java.util.PriorityQueue(java.util.Collections.reverseOrder());
		priority.add(10);
		priority.add(30);
		priority.add(20);
		System.out.println(priority.poll());
		System.out.println(priority.poll());
		System.out.println(priority.poll());
		
//		System.out.println(solution(4, new int[]{4,10,15}, new int[]{20,5,10}, 30));
		System.out.println(solution(4, new int[]{1,2,3,4}, new int[]{10,40,20,30}, 100));
	}
	
	
	
	// 매운맛
//	public static int solution(int[] scoville, int K) {
//		int mixed = 0;
//		java.util.PriorityQueue<Integer> priority = new java.util.PriorityQueue();
//		
//		for(int i : scoville)
//			priority.offer(i);
////			priority.add(i); // 이것도 동일한 메소드
//	
//		while(priority.peek() <= K) {
//			if(priority.size() == 1)
//				return -1;
//			
//			int a = priority.poll();
//			int b = priority.poll();
//			
//			priority.offer(a + b * 2);
//			mixed++;
//		}
//		return mixed;
//	}
	
	
	// 라면공장
    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int i = 0, j, result = 0;
        PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());
        
        while(stock < k) {
        	for (j = i; j < dates.length; j++) {
        		if(dates[j] <= stock){
        			queue.add(supplies[j]);
        		}else {
        			i = j; 
        			break;
        		}
        	}
        	
        	if(j == dates.length)
        		i = j;
        	
        	stock += queue.poll();
        	result++;
        }
        
        return result;
    }
	
}
