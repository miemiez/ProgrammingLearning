public class TestArrays{
	public static void main(String[] args) {
		int[] ar = new int[3];
		ar[0] = 1;
		ar[1] = 20;
		ar[2] = 3;
		//计算所有元素总和；
		int a = 0;
		for(int i = 0;i < ar.length;i++) {
			a += ar[i];
		}
		System.out.println(a);
		
		//这两个方法都可以；
		int b = 0;
		for(int element : ar) {
			b += element;
		}
		System.out.println(b);
		
		//查找最大元素；
		int max = ar[0];
		for(int element : ar) {
			if(element > max) {
				max = element;
			}
		}
		System.out.println(max);
		
		//同样也可以这样写：
		int max01 = ar[0];
		for(int i = 0;i < ar.length;i++) {
			if( ar[i] > max01) {
				max01 = ar[i];
			}
		}
		System.out.println(max01);
	}
}