package Day09AnonymityInnerClass;

public class Test {
	//这是一个没有名字的成员内部类；
	AnonOuter a = new AnonOuter() {

		@Override
		public void work() {
			// TODO Auto-generated method stub
			System.out.println("重写了work方法");
		}
	};
	
	
	public static void main(String[] args) {
		/* *****匿名内部类实际上是创建一个匿名内部类的对象*****
		 * 理解匿名内部类的格式：
		 	new 类名或者接口名（）{
		 		重写方法；
		 	}
		 */
		
		//不同于没有名字的成员内部类，这两种都为局部匿名内部类；
		new Inter() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("重写了方法1");
			}
		};
		
		new AnonOuter() {

			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("重写了work方法");
			}
		};
		
		/*之前如果要调用下面的method方法
		 *1.要先创建一个子类去继承Animal类
		 *2.再创建子类的对象，传输给method方法（见多态Day04Polymorphism）
		 *
		 *但如果子类只需要调用一次，还要去特意定义一下，实在是太麻烦了，所以这种情况下就可以用匿名内部类
		 */
		
		//这就相当于把这个匿名内部类的对象赋值给method方法的形参；
		method(
				new AnonOuter() {

					@Override
					public void work() {
						// TODO Auto-generated method stub
						System.out.println("重写了work方法");
					}
				}
		);
		
	}
	
	public static void method(AnonOuter a) {//就相当于AnonOuter a = 子类对象；
		a.work();//编译看左边（看AnonOuter这个类里面有没有work方法，没有就报错），运行看右边（实际运行是运行已经被匿名内部类重写了的work方法）
	}
}
