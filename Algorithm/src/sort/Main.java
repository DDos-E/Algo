package sort;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import javax.naming.PartialResultException;

public class Main {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
//        int[] arr = {3,5,4,2,1};
        int[] arr = {3,9,4,7,5,0,1,6,8,2};

        for(int i:arr)
        	System.out.print(i+" ");
        System.out.println();
        
        //버블정렬
//        bubbleSort(arr);
        
        //퀵 정렬
        quickSort(arr);
        
        for(int i:arr)
        	System.out.print(i+" ");
        
        
    }
	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
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
	
	
	
	//버블정렬
	private static void bubbleSort(int[] arr) {
		
		bubbleSort(arr, arr.length - 1);
	}
	private static void bubbleSort(int[] arr, int last) {
		if(last > 0) {
			for(int i = 1;i <= last;i++) {
				if(arr[i - 1] > arr[i]) {
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
				}
			}
			bubbleSort(arr, last - 1);
		}
	}
	

}
