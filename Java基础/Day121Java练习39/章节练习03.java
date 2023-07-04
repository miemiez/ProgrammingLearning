package Day121Java练习39;

public class 章节练习03 {
	public static void main(String[] args) {
		try {
			func();
			System.out.println("A");
		}catch(Exception e) {
			System.out.println("C");
		}
		System.out.println("D");
		//B,C,D
	}
	
	public static void func() {
		try {
			throw new RuntimeException();
		}finally {
			System.out.println("B");
		}
	}
}