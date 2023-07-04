package Day121Java练习39;

public class 章节练习02 {
	public static void main(String[] args) {
		if(args[4].equals("john")) {//会发生ArrayIndexOutOfBoundsException
			System.out.println("AA");
		}else {
			System.out.println("BB");
		}
		Object o = args[2];
		Integer i = (Integer)o;//会发生ClassCastException
	}
}