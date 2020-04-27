package back;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Back_1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Point> list = new ArrayList<Point>();
		List<Integer> roomList = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) 
			list.add(new Point(sc.nextInt(),sc.nextInt()));
		
		Point target = new Point(list.get(0).x,list.get(0).y);
		
		Collections.sort(list, new Comparator<Point>() {
			public int compare(Point p1, Point p2) {
				return Integer.compare((int)p1.getX(), (int)p2.getX());
			}
		});
		
		while(true) {
			
			for (int i = 0; i < n; i++) {
//				if(list.get(i).x >= 4 && )
			}
			
		}
		
	}
	
	
	
	
	/*
	 * 회의실 개수 구하는 방법
	 */
	
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		List<Point> list = new ArrayList<Point>();
//		List<Integer> roomList = new ArrayList<Integer>();
//		
//		int n = sc.nextInt();
//		for (int i = 0; i < n; i++) 
//			list.add(new Point(sc.nextInt(),sc.nextInt()));
//		
//		
////		for(Point p:list)
////			System.out.println(p);
//		
//		Collections.sort(list, new Comparator<Point>() {
//			public int compare(Point p1, Point p2) {
//				return Integer.compare((int)p1.getX(), (int)p2.getX());
//			}
//		});
//		
//		for(Point p:list)
//			System.out.println(p);
//		
//		for (int i = 0; i < n; i++) {
//			if(i == 0) roomList.add(list.get(i).x);
//			for (int j = 0; j < roomList.size(); j++) {
//				if(list.get(i).x >= roomList.get(j)) {
//					System.out.println("수정 = "+list.get(i).y);
//					roomList.set(j, list.get(i).y);
//					break;
//				}else if(j == roomList.size()-1){
//					System.out.println("추가 = "+list.get(i).y);
//					roomList.add(list.get(i).y);
//					break;
//				}
//			}
//		}
//		
//		System.out.println(roomList.size());
//		
//	}
}
