package Day110Java练习28;

abstract public class Template {
	public abstract void job();//抽象方法
	
	public void calculateTime() {//统计耗时多久这个方法的写法是固定的
		long start = System.currentTimeMillis();
		job();
		long end = System.currentTimeMillis();
		System.out.println("工作耗时：" + (end - start));
	}
}
