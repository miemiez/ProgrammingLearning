package Day98Java练习16;

public class Practice01多态 {
	public static void main(String[] args) {
		double d = 3.14;
		long l = (long) d;
		System.out.println(l);
		
		/*
		 * int i = 5;
		 * boolean b = (boolean)i;错误
		 */
		
		Object obj = "Hello";//对的，可以向上转型
		String objStr = (String)obj;//对的，可以向下转型（强转）
		System.out.println(objStr);
		
		Object objPri = new Integer(5);//对的，可以向上转型
		//String str = (String)objPri;错误，指向Integer的父类引用，转成String
		Integer str1 = (Integer)objPri;//对的，可以向下转型（强转）
		System.out.println(str1);
	    
	}
}
