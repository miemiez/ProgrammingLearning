package Day137Java55;

import java.util.ArrayList;
import java.util.List;

public class ArrayList注意事项 {
	public static void main(String[] args) {
		/*
		 * （1）permits all elements,including null,ArrayList可以加入null，并且多个
		 * （2）ArrayList是由数组来实现数据存储的
		 * （3）ArrayList基本等同于Vector，除了ArrayList是线程不安全（执行效率高）看源码，在多线程的情况下不建议使用ArrayList
		 */
		
		/*
		 * ArrayList扩容机制（使用无参构造器创建的ArrayList集合）：
		 *     （1）创建一个elementData数组 = {}
		 *     （2）执行list.add()先确定是否要扩容，再执行赋值
		 *     （3）第一次扩容为10
		 *     （4）modCount++ 记录集合被修改的次数
		 *     （5）如果elementData的大小不够，就调用grow()去扩容
		 *     （6）【真正的扩容】使用扩容机制来确定要扩容到多大
		 *     （7）第一次newCapacity = 10
		 *     （8）第二次及以后，按照1.5倍扩容【有参构造器，只要*1.5，之后>10，就直接按照原来的容量直接1.5倍扩容】
		 *     （9）扩容使用的是Arrays.copyOf()
		 */
		
		/*
		 * 小结：
		 * （1）ArrayList中维护了一个Object类型的数组elementData
		 *      transient Object[] elementData;//transient 表示瞬间，短暂的，表示该属性不会被序列化
		 * （2）当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0，第一次添加，则扩容
		 *      elementData为10，如需再次扩容，则扩容elementData为1.5倍。
		 * （3）如果使用的是指定大小的构造器，则初始elementData容量为指定大小，如果需要扩容，则直接扩容elementData为1.5倍
		 */
	}
}
