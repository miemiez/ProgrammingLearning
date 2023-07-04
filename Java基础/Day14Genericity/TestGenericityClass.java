package Day14Genericity;

public class TestGenericityClass {
	public static void main(String[] args) {
		GenericityClass<String> userIdStr = new GenericityClass<>();
		userIdStr.setType("18200121228");
		System.out.println(userIdStr.getType());
		
		GenericityClass<Integer> userIdInt = new GenericityClass<>();
		userIdInt.setType(228);
		System.out.println(userIdInt.getType());
	}
}
