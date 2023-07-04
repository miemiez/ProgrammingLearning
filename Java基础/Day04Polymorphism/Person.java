package Day04Polymorphism;

public class Person{
	
	private int age;
	private String name;
	
	
	public Person() {
		
	}
	
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void keepPet(Animal a,String s) {
		if(a instanceof Dog d)//如果Animal对象a，接收的是一个Dog类型的对象，则把Animal类型的对象a，强转为Dog类型的对象d；
			{
			System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + d.getAge() + "岁的" + d.getColor() + "狗");
			d.eat(s);
			d.lookHome();
		}else if(a instanceof Cat) 
			{
			Cat c = (Cat)a;
			System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + c.getAge() + "岁的" + c.getColor() + "猫");
			c.eat(s);
			c.catchMouse();
		}else {
			System.out.println("没有这种动物");
		}
		
		
	}
}