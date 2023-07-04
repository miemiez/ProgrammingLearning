package Day14Genericity2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr {
	public static void main(String[] args) {
		List<String> als = new ArrayList<>();
		List<String> als2 = Arrays.asList("a","b","c");
		//但是如果使用Arrays.asList方法创建的集合，是不能够进行添加和删除的（数组长度固定）
		als.add("a");
		System.out.println(als);
		System.out.println(als2);
	}
}
