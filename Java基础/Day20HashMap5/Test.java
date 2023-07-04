package Day20HashMap5;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//计算输入的字符串中重复字符的个数
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = s.next();
		
		HashMap<Character,Integer> hashMap = new HashMap<>();
		for(int i = 0;i < str.length();i++) {
			Character key = str.charAt(i);
			Integer value = hashMap.get(key);
			if(value == null) {
				value = 1;
			}else {
				value++;
			}
			
			hashMap.put(key, value);
		}
		
		for(Character c:hashMap.keySet()) {
			System.out.println(c + "字符的个数为：" + hashMap.get(c));
		}
	}
}
