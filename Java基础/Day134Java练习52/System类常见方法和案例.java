package Day134Java练习52;

import java.util.Arrays;

public class System类常见方法和案例 {
	public static void main(String[] args) {
		/*
		 * exit：退出当前程序
		 *     1.exit(0)表示程序退出
		 *     2.0表示一个状态，正常的状态【一般主动退出都填0】
		 */
		//System.exit(0);
		
		
		/*
		 * arraycopy：复制数组元素，比较适合底层调用，一般使用Arrays.copyOf完成复制数组
		 */
		int[] src = {1,2,3};
		int[] dest = new int[3];
		/*
		 * 搞清楚这五个参数的含义：
		 *     1.src【源数组】
		 *     2.代表从源数组的哪个索引开始拷贝
		 *     3.dest【目标数组，即把源数组的数据拷贝到哪个数组】
		 *     4.代表从目标数组的哪个索引开始拷贝源数组
		 *     5.length【从源数组拷贝多少个数据到目标数组】
		 */
		System.arraycopy(src, 0, dest, 0, 3);
		System.out.println(Arrays.toString(dest));//[1,2,3]
		System.arraycopy(src, 1, dest, 0, 2);//[2,3,3]
		System.out.println(Arrays.toString(dest));
		
		
		/*
		 * currentTimeMillis：返回当前时间距离1970-1-1的毫秒数
		 */
		System.out.println(System.currentTimeMillis());
		
		
		/*
		 * gc：运行垃圾回收机制【Object类的finalize方法用的就是这个机制】
		 */
		System.gc();
	}
}
