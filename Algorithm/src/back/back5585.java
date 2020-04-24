package back;

import java.util.Scanner;

public class back5585 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 1000 - sc.nextInt();
        int[] coin = {500, 100, 50, 10, 5, 1};
        int result = 0;
        
        while(true) {
        	for (int i = 0; i < coin.length; i++) {
				if(value >= coin[i]) {
					value -= coin[i];
					result++;
					break;
				}
			}
        	if(value < 10) break;
        }
        System.out.println(result);
	}
}
