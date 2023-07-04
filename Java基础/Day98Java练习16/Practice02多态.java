package Day98Java练习16;

public class Practice02多态 extends Base{
	public static void main(String[] args) {
		Practice02多态 p = new Practice02多态();
		System.out.println(p.count);//20
		p.display();//20
		
		Base b = p;
		System.out.println(b == p);//true
		System.out.println(b.count);//10（看的是编译类型，编译类型为Base，所以结果是10）
		b.display();//20（看的是运行类型，运行类型是Practice02多态，所以结果是20）【方法的调用，都看对象的（b）运行类型】
	}
	
	int count = 20;
	
	public void display() {
		System.out.println(this.count);
	}
}

class Base{
	int count = 10;
	public void display() {
		System.out.println(this.count);
	}
}
