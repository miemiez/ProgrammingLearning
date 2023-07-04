package Day11ArrayList;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		//ArrayList<Integer> ali = new ArrayList<Integer>();
		ArrayList<Integer> ali = new ArrayList<>();//和上面的创建方法一样，适用于jdk5之后
		//ArrayList<String> als = new ArrayList<String>();
		ArrayList<String> als = new ArrayList<>();//和上面的创建方法一样，适用于jdk5之后
		
		//打印对象不是地址值，而是集合中存储的数据内容
		//在展示的时候会拿[]把所有的数据进行包裹
		
		//增
		System.out.println(ali);
		boolean b = als.add("aaa");
		als.add("bbb");
		als.add("ccc");
		als.add("ddd");
		ali.add(1);
		ali.add(2);
		ali.add(3);
		ali.add(4);
		ali.add(5);
		System.out.println(b + "  " + als);
		System.out.println(ali);
		
		//删
		als.remove("aaa");
		System.out.println(als);
		als.remove(0);
		System.out.println(als);
		String s = als.remove(0);
		System.out.println("被删除的元素为：" + s);
		System.out.println(als);
		
		//改
		ali.set(2, 33);
		int s1 = ali.set(4, 555);
		System.out.println("被修改的元素为：" + s1);
		System.out.println(ali);
		
		//查
		int s2 = ali.get(1);
		System.out.println(s2);
		
		//返回长度
		System.out.println(als.size());
		System.out.println(ali.size());
	}
}