package Day136Java练习54;

public class 数组 {
	public static void main(String[] args) {
		Animal[] aArr = new Animal[2];
		aArr[0] =  new Animal();
		aArr[1] = new Person();
		System.out.println(aArr[0]+"!!"+aArr[1]);
	}
}

class Animal{
	

}

class Person extends Animal{
	
}
