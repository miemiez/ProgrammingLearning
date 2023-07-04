package Day129Java练习47;

import java.util.Arrays;
import java.util.List;

public class Arrays排序原码解读 {
	public static void main(String[] args) {
		/*
		 * Arrays里面包含了一系列静态方法，用于管理或操作数组（比如排序和搜索）
		 */
		
		//Arrays.toString(arr);【返回数组的字符串形式】
		Integer[] integers = {1,20,30};
		System.out.println(Arrays.toString(integers));
		
		//Arrays.sort(arr);【排序】
		//sort是重载的，也可以通过传入一个接口Comparator来实现定制排序
		Integer[] arr = {1,-1,7,0,89};
		Character[] arr2 = {'z','c','d','嫴'};
		String[] arr3 = {"-2","1","-5","10"};
		Arrays.sort(arr);//因为数组是引用类型，所以通过sort排序后，会直接影响到实参arr
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, (o1,o2) -> {Integer i1 = (Integer) o1;
		                             Integer i2 = (Integer) o2;
		                             return i2 - i1;});//降序
		System.out.println(Arrays.toString(arr));
		
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr2,(o1,o2) -> {Character i1 = (Character)o1;
		                             Character i2 = (Character)o1;
		                             return i2 - i1;});
		System.out.println(Arrays.toString(arr2));
		
		
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		Arrays.sort(arr3,(o1,o2) -> {Integer i1 = Integer.valueOf(o1);
			                         Integer i2 = Integer.valueOf(o2);
			                         return i2 - i1;
		});
		System.out.println(Arrays.toString(arr3));
	}
}
