package Day94Java练习12;

public class Practice01可变参数 {
	public static void main(String[] args) {
		Practice01可变参数 p = new Practice01可变参数();
		int[] arr1 = {1,2,3};
		double[] arr2 = {1.1,2.2,3.3};
		p.VarParameterDetail01(arr1);//可以传入数组
		p.VarParameterDetail02("这个方法内", 0 , arr2);
	}
	
	public void VarParameterDetail01(int... nums) {
		System.out.println("长度为" + nums.length);
	}
	
	//可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
	public void VarParameterDetail02(String str,double d,double... ds) {
		System.out.println(d + str + "一共有" + (ds.length + 2) + "个实参");
	}
	
	//一共形参列表中只能出现一共可变参数【下面写法是错误的】
//	public void VarParameterDetail03(int... is,double... ds) {
//		
//	}
}
