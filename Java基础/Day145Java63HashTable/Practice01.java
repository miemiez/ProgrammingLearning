package Day145Java63HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice01 {
	public static void main(String[] args) {
		int[] arr = {12,3,45,56,6,4};
		int[] arr02 = new int[2];
		System.arraycopy(arr, 0, arr02, 0, 2);
		System.out.println(Arrays.toString(arr02));
		List<B> list = new ArrayList<>();
		A a = new B();
		list.add((B)a);
	}
}

class A{
	
}

class B extends A{
	
}

class C extends B{
	
}