package Day121Java练习39;

public class 章节练习04 {
	public static void main(String[] args) {
		try {
			showExce();
			System.out.println("A");
		}catch(Exception e) {
			System.out.println("B");
		}finally {
			System.out.println("C");
		}
		System.out.println("D");
		//B,C,D
	}
	
	public static void showExce() throws Exception{
		throw new Exception();
	}
}
