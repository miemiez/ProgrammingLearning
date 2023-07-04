package Day06Interface;

public class Test {
	public static void main(String[] args) {
		Frog f = new Frog("呱呱",2);
		f.eat1();
		f.swim();
		System.out.print("\n");
		
		Dog d = new Dog("旺旺",5);
		d.eat1();
		d.swim();
		System.out.print("\n");
		
		Rabbit r = new Rabbit("灰灰",3);
		r.eat1();
	    //r.swim();   这个是调用不了接口里的抽象方法swim()的；
		System.out.print("\n");
		
	}
}
