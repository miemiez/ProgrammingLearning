package Day14Genericity;

public class TestGenericityInterface {
	public static void main(String[] args) {
		GenericityInterfaceImpl<String> giis = new GenericityInterfaceImpl<>();
		System.out.println(giis.show("ABCD"));
		
		GenericityInterfaceImpl<Integer> giii = new GenericityInterfaceImpl<>();
		System.out.println(giii.show(1234));
	}
}
