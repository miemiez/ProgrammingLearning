package Day01This;

public class ThisTest{
	public static void main(String[] args) {
		This.teacherName = "mmz";
		
		This t1 = new This();
		System.out.println("t1:" + t1);//此值与t1.show()打印的this值相等
		t1.name = "yang";
		t1.age = 22;
		t1.show();
		
		This t2 = new This();
		System.out.println("t2" + t2);//此值与t2.show()打印的this值相等
		t2.name = "he";
		t2.age = 18;
		t2.show();
	}
}