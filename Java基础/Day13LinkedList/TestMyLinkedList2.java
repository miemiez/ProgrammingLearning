package Day13LinkedList;

public class TestMyLinkedList2 {
	public static void main(String[] args) {
		MyLinkedList2<String> mll2 = new MyLinkedList2<String>();
		mll2.myAdd("a");
		mll2.myAdd("b");
		mll2.myAdd("c");
		mll2.myAdd("d");
		System.out.println(mll2.getSize());
		System.out.println(mll2.myGet(0));
		System.out.println(mll2.myGet(1));
		System.out.println(mll2.myGet(2));
		System.out.println(mll2.myGet(3));
	}
}
