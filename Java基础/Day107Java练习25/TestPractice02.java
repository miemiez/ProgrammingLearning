package Day107Java练习25;

public class TestPractice02 {
	public static void main(String[] args) {
		System.out.println("Number of total is" + Practice02.getTotal());
		Practice02 p = new Practice02();
		System.out.println("Number of total is" + Practice02.getTotal());
	}
}

class Practice02{
	private static int id;
	private static int total = 0;
	
	public static int getTotal() {
		id++;
		return total;
	}
	
	public Practice02() {
		total++;
		id = total;
	}
}
