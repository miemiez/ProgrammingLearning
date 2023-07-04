package Day99Java练习17;

public class Practice02 {
	public static void main(String[] args) {
		Practice02 p = new Practice02();
		Practice02 p1 = new Practice02();
		Practice02 p2 = p;
		System.out.println(p.hashCode() == p1.hashCode());
		System.out.println(p2.hashCode() == p.hashCode());
	}
}
