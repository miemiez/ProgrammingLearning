package Day18HashCode;

public class Test {
	public static void main(String[] args) {
		//hashCode()方法就是将堆内存地址转化成整数类型
		//***非常重要！***重写equals方法的同时也一定要重写hashCode方法
		//***非常重要！***如果用equals方法去比较两个对象相等，则HashCode值一定也相等，但是如果HashCode值相等，equals比较却不一定相等
		//Hash冲突问题：如果两个对象的HashCode值相等，但是值是不同
		//HashMap集合的底层源码，就是根据该对象的HashCode值计算存放到数组中index位置
		Student s1 = new Student("LHY",22);
		Student s2 = new Student("WP",23);
		Student s3 = new Student("LHY",22);
		String str = "a";
		Integer i = 97;//整数类型，包装类Integer的hashCode的值，就是该整数类型值
		
		System.out.println(str.hashCode());//97
		System.out.println(i.hashCode());//97
		System.out.println(str.equals(i));//false
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
