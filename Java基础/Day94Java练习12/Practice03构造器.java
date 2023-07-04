package Day94Java练习12;

public class Practice03构造器 {
	public static void main(String[] args) {
		Practice03构造器 p1 = new Practice03构造器();
		Practice03构造器 p2 = new Practice03构造器("XYY",20);
		System.out.println(p1.name + "今年" + p1.age);//18
		System.out.println(p2.name + "今年" + p2.age);//20
	}
	
	String name;
	int age = 18;
	
	public Practice03构造器(){
		
	}
	
	public Practice03构造器(String name,int age) {
		this.name = name;
		this.age = age;
	}
}
