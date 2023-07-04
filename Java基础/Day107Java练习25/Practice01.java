package Day107Java练习25;

public class Practice01 {
	static int count = 9;
	
	public static void main(String[] args) {
		new Practice01().count();//count = 9
		new Practice01().count();//count = 10
		System.out.println(Practice01.count);//11
	}
	
	public void count() {
		System.out.println("count = " + (count++));
	}
}
