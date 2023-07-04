package Day05Abstract2;

public class Test{
	public static void main(String[] args) {
		Frog f = new Frog("呱呱",2);
		System.out.println(f.getAge() + "岁的" + f.getName());
		f.eat();
		f.drink();
		System.out.print("\n");
		
		Dog d = new Dog("旺旺",1);
		System.out.println(d.getAge() + "岁的" + d.getName());
		d.eat();
		d.drink();
		System.out.print("\n");
		
		Sheep s = new Sheep("咩咩",1);
		System.out.println(s.getAge() + "岁的" + s.getName());
		s.eat();
		s.drink();
		System.out.print("\n");
		
		
		//利用多态；
		Animal a1 = new Dog("小黑",2);
		a1.zh(a1);
		System.out.print("\n");
		
		Animal a2 = new Frog("小绿",3);
		a2.zh(a2);
		System.out.print("\n");
		
		Animal a3 = new Sheep("艾雅法拉",2);
		a3.zh(a3);
		System.out.print("\n");
	}
}