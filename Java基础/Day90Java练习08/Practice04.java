package Day90Java练习08;

import java.util.ArrayList;

public class Practice04 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Test02 t = new Test02();
		t.factorial(arr);
		for(int i = 0;i < arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}
}

class Test02{
	public ArrayList<Integer> factorial(ArrayList<Integer> arr) {
		if(arr.size() < 10) {
			arr.add(arr.size());
			return factorial(arr);
		}else {
			return arr;
		}
	}
}
