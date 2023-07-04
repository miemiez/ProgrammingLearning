package Day107Java练习25;

public class TestPractice03 {
	public static void main(String[] args) {
		Practice03.setTotal(3);
		System.out.println("id的值为:" + new Practice03().getId());//4
		System.out.println(Practice03.m());//4
	}
}

class Practice03{
	private int id;
	private static int total = 0;
	
	public static void setTotal(int total) {
		//this.total = total;//错误。因为static方法中，不可以使用this关键字
		Practice03.total = total;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getTotal() {
		return total;
	}

	public Practice03() {
		total++;
		id = total;
	}
	
	public static String m() {
		return "total的值为:" + total;
	}
}
