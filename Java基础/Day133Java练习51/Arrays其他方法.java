package Day133Java练习51;

import java.util.Arrays;
import java.util.List;

public class Arrays其他方法 {
	public static void main(String[] args) {
		/*
		 * Arrays.binarySearch(Object[] a, Object key)：二分查找法
		 *    1.使用binarySearch二叉查找
		 *    2.要求该数组是有序的，如果该数组是无须的，不能使用binarySearch，因为会在查找时，虽然有些是正确的，但有些元素就会显示错误，所以无序的话就不能使用
		 *    3.如果数组中存在该元素，返回key的索引；如果数组中没有该元素，则返回-(第一个比此元素大的数的下标+1)
		 */
		Integer[] arr = {1,2,3,9,90,123};
		Integer[] chaosArr = {1,4,120,3,5,234};
		String[] chaosArr2 = {"我","益","哇","孙","并"};
		System.out.println(Arrays.binarySearch(arr,3));//2(找到3所在的索引)
		System.out.println(Arrays.binarySearch(arr,8));//-4
		System.out.println(Arrays.binarySearch(chaosArr,234));//虽然这个是正确的
		System.out.println(Arrays.binarySearch(chaosArr,5));//但是这个就不行
		System.out.println(Arrays.binarySearch(chaosArr2,"益"));
		
		/*
		 * copyOf：数组元素的复制
		 *     1.从arr数组中，拷贝arr.length个元素到newArr数组中
		 *     2.如果数组长度 > arr.length就在新数组的后面增加null
		 *     3.如果拷贝的长度 < 0就抛出异常
		 *     4.该方法的底层使用的是System.arraycopy()
		 */
		Integer[] newArr = Arrays.copyOf(arr, arr.length - 1);
		Integer[] newArr2 = Arrays.copyOf(arr,arr.length + 4);
		System.out.println(Arrays.toString(newArr));//拷贝执行结束后的结果
		System.out.println(Arrays.toString(newArr2));//如果原数组长度不足的话，在新数组的最后补null
		
		/*
		 * fill：数组元素的填充
		 */
		Integer[] num = {9,3,2};
		Arrays.fill(num,99);
		System.out.println(Arrays.toString(num));
		
		/*
		 * equals：比较两个数组元素内容是否完全一致
		 */
		boolean equals = Arrays.equals(arr, chaosArr);
		System.out.println(equals);
		
		/*
		 * asList将一组值，转换成List，但是用这个方法做成的List不能增加或者删改
		 *     1.asList方法，会将(1,2,3,5,6,78)数组转成一个List集合
		 *     2.返回的asList编译类型 List(接口)
		 *     3.asList运行类型 java.util.Arrays#ArrayList(静态内部类)
		 */
		List<Integer> asList = Arrays.asList(1,2,3,5,6,78);
		System.out.println(asList);
	}
}
