public class TestOperator{
	public static void main(String[] args) {
		//Logical operator
		boolean a = true;
		boolean b = false;
		//&
		System.out.println(a & a);
		System.out.println(b & b);
		System.out.println(a & b);
		System.out.println(b & a);
		System.out.println("\n");
		
		//|
		System.out.println(a | a);
		System.out.println(b | b);
		System.out.println(a | b);
		System.out.println(b | a);
		System.out.println("\n");
		
		//^
		System.out.println(a ^ a);
		System.out.println(b ^ b);
		System.out.println(a ^ b);
		System.out.println(a ^ b);
		System.out.println("\n");
		
		//!
		System.out.println(!a);
		System.out.println(!b);
		System.out.println("\n\n");
		
		
		//Short circuit logical operator
		//&&,運行結果與&一樣，但是在運行的時候，如果前面一個（a）為假，則直接得出結果為假，不會再運算（b）,從而節省性能；
		System.out.println(a && a);
		System.out.println(b && b);
		System.out.println(a && b);
		System.out.println(b && a);
		int c = 8;
		int d = 10;
		boolean e = ++c < 5 && ++d < 5;
		System.out.println(e);//false
		System.out.println(c);//9
		System.out.println(d);//10 ++c < 5 已經得出結果為false了，不會再運算++d < 5了
		System.out.println("\n");
		
		//||,運行結果與|一樣，但是在運行的時候，如果前面一個（a）為真，則直接得出結果為真，不會再運算（b），從而節省性能；
		System.out.println(a || a);
		System.out.println(b || b);
		System.out.println(a || b);
		System.out.println(b || a);
		int f = 8;
		int g = 10;
		boolean h= ++f > 6 || ++g < 6;
		System.out.println(h);//true
		System.out.println(f);//9
		System.out.println(g);//10 ++f > 6 已經得出結果為true了，不會再運算++g < 6了
		System.out.println("\n");
	}
}