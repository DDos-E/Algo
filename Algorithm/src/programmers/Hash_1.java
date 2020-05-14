package programmers;


public class Hash_1 {

	public static void main(String[] args) {

//		String[] phone_book = {"88","123","567","1235","12"};
//		String[] phone_book = {"119","97674223","1195524421"};
//		String[] phone_book = {"123","456","567"};
//		System.out.println(solution(phone_book));
		
//		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		
		System.out.println(solution(clothes));
	}
	
// 완주하지 못한 선수
//    public static String solution(String[] participant, String[] completion) {
//        int i;
//    	java.util.Arrays.sort(participant);
//        java.util.Arrays.sort(completion);
//        
//        for (i = 0; i < completion.length; i++) 
//        	if(!participant[i].equals(completion[i]))				
//        		break;
//			
//		
//        return participant[i];
//    }
	
	//전화번호부
//    public static boolean solution(String[] phone_book) {
//        java.util.Arrays.sort(phone_book);
//        
//        for (int i = 0; i < phone_book.length-1; i++) 
//			if(phone_book[i+1].startsWith(phone_book[i])) 
//				return false;
//		
//        return true;
//    }
	
	public static int solution(String[][] clothes) {
		java.util.Map<String, Integer> map = new java.util.HashMap<>();
		int temp = 1;
		int result = 0;
		
		for(String[] s : clothes) {
			if(map.get(s[1]) == null)
				map.put(s[1], 1);
			else
				map.put(s[1], map.get(s[1])+1);
			
			result++;
		}
		
		for(String key : map.keySet()) 
			temp *= map.get(key);

		if(result == temp) return result;
		else return result + temp;
	}
}
