package Day17HashMap2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<String,String> mss = new HashMap<>();
		mss.put("1", "a");
		mss.put("2", "b");
		mss.put("3", "c");
		
		//遍历方法一：
		Set<String> ss = mss.keySet();
		for(String str:ss) {
			String s = mss.get(str);
			System.out.println(str + "=" + s);
		}
		
		//遍历方法二：
		Set<Map.Entry<String, String>> smss = mss.entrySet();
		for(Map.Entry<String, String> m:smss) {
			System.out.println(m.getKey() + "=" + m.getValue());//就等于System.out.println(m);
		}
		
		//遍历方法三：
		Iterator<Map.Entry<String, String>> iterator = smss.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(mss);
		System.out.println(smss);
	}
}
