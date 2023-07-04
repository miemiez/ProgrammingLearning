package Day145Java63HashTable;

import java.util.ArrayList;

public class Practice03 {
	public static void main(String[] args) {
		
		System.out.println(primeFinder(20));
	}
	
	public static ArrayList<Integer> primeFinder(int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		boolean judge = true;
		for(int i = 2;i < n;i++) {
			judge = true;
			for(int j = 2;j < i;j++) {
				if(i % j == 0) {
					judge = false;
					break;
				}
			}
			if(judge == true) {
				arr.add(i);
			}
		}
		return arr;
	}
}
