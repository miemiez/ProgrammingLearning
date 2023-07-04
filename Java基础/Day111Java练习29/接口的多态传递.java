package Day111Java练习29;

public class 接口的多态传递 {
	public static void main(String[] args) {
		IG ig = new Teacher();//接口类型的变量可以指向，实现了该接口的类的对象实例
		IH ih = new Teacher();//如果IG继承了IH接口，而Teacher类实现了IG接口，那么实际上就相当于Teacher这个类也实现了IH这个接口【这就是接口多态传递现象】
	}
}

interface IH {
	
}

interface IG extends IH{
	
}

class Teacher implements IG{
	
}
