package Day141Java练习59HashSet;

public class HashSet扩容机制 {
	public static void main(String[] args) {
		/*
		 * （1）HashSet底层是HashMap
		 * （2）添加一个元素时，先得到hash值 -会转成 -> 索引值
		 * （3）找到存储数据表table，看这个索引位置是否已经存放有元素
		 * （4）如果没有，直接加入
		 * （5）如果有，调用equals比较，如果相同，就放弃添加，如果不相同，则添加到最后
		 * （6）在Java8中，如果一条链表的元素个数超过TREEIFY_THRESHOLD（默认是8），并且table的大小 >= MIN_TREEIFY_CAPACITY（默认64），就会进行树化（红黑树）
		 */
	}
}
