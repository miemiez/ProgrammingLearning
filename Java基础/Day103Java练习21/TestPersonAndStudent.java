package Day103Java练习21;

public class TestPersonAndStudent {
	public static void main(String[] args) {
		//向上转型：父类的引用指向子类对象
		Person p = new Student();
		p.run();//student run【因为运行类型为Student，所以该调用其实是通过动态绑定调用的Student类的run方法】
		p.eat();//person eat
		//p.study();以为编译类型为Person，不可以调用其子类的Student中的study方法
		
		//向下转型：把指向子类对象的父类引用，转向指向子类对象的子类引用
		Student s = (Student)p;
		s.run();//student run
		s.eat();//person eat
		s.study();//person eat
	}
}
