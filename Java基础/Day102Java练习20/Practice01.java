package Day102Java练习20;

public class Practice01 extends Test{
	String name = "Jack";
	
	public static void main(String[] args) {
		new Practice01().test();//Test  Practice01 Rose Jack
		new Practice01("John").test();//John Jack
	}
	
	Practice01(){
		super();
		System.out.println("Practice01");
	}
	
	Practice01(String s){
		super(s);
	}
	
	public void test() {
		System.out.println(super.name);
		System.out.println(this.name);
	}
}

class Test{
	String name = "Rose";
	
	Test(){
		System.out.println("Test");
	}
	
	Test(String name){
		this.name = name;
	}
}