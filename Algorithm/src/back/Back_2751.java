package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back_2751 {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int[] n;
	
	public static void main(String[] args) {
		try {
			String s = bf.readLine();
			n = new int[Integer.parseInt(s)];
			
			for (int i = 0; i < n.length; i++) 
				n[i] = Integer.parseInt(bf.readLine());
		} catch (IOException e) {
		}
		
        quickSort(n);
        
        for(int i:n) {
        	try {
        		bw.write(i+"\n");
				bw.flush();
			} catch (IOException e) {
			}
        }

		
	}
	
	//퀵 정렬
	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		if(start < part2 - 1) {
			quickSort(arr, start, part2 - 1);
		}
		if(part2 < end) {
			quickSort(arr, part2, end);
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];
		while (start <= end) {
			while(arr[start] < pivot) start++;
			while(arr[end] > pivot) end--;
			if(start <= end) {
				swap(arr,start,end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
