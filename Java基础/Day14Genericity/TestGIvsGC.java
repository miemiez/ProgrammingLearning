package Day14Genericity;

public class TestGIvsGC {
	//泛型方法与泛型接口的区别，详细见GIvsGC.java
	public static void main(String[] args) {
		GCvsGI<String> cvi = new GCvsGI<>();
		String str = cvi.show("aaa");
		System.out.println(str);
		
		String str2 = cvi.show("bbb",123);
		System.out.println(str2);
		
		Integer str3 = cvi.show2("ccc",321);
		System.out.println(str3);
	}
}
