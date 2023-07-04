package Day13LinkedList;

public class TestMyLinkedList {
	public static void main(String[] args) {
		MyLinkedList<String> mll = new MyLinkedList<>();
		mll.add("A");
		mll.add("B");
		mll.add("C");
		mll.add("D");
		System.out.println(mll.getSize());
	}
}
