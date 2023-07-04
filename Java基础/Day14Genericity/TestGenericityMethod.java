package Day14Genericity;

public class TestGenericityMethod {
	public static void main(String[] args) {
		GenericityMethod gms = new GenericityMethod();
		
		String str= gms.show("www");
		Integer integer = gms.show(111);
		
		System.out.println(str);
		System.out.println(integer);
	}
}
