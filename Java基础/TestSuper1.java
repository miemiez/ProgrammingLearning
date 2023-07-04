/*1.重写方法的名称，形参列表必须与父类中的一致；
 * 2.子类重写父类方法时，访问权限子类必须大于等于父类；
 * 3.子类重写父类方法时，返回值类型子类必须小于等于父类；
 * ****4.建议：重写的方法尽量和父类保持一致；
 * ****5.只有被添加到虚方法表中的方法才能被重写（不是private/不是static/不是final);
 */
public class TestSuper1{
	public static void main(String[] args) {
		String name = "Fu";
		Zi z = new Zi();
		z.ziShow();
		z.lunch();
	}
}

class Fu{
	String name = "Fu";
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void drink() {
		System.out.println("喝水");
	}
}

class Zi extends Fu{
	String name = "Zi";
	
	@Override
	public void eat() {
		System.out.println("吃面条");
	}
	
	@Override
	public void drink() {
		System.out.println("喝饮料");
	}
	
	public void lunch() {
		this.eat();//吃面条;
		this.drink();//喝饮料;
		
		super.eat();//吃饭;
		super.drink();//喝水;
	}
	
	public void ziShow() {
		String name = "ziShow";
		System.out.println(name);//ziShow;
		System.out.println(this.name);//Zi;
		System.out.println(super.name);//Fu;
	}
}

