public class TestChar{
	public static void main(String[] args){
		Character ch = new Character('a');
		System.out.println(ch);
		System.out.println("\n");
		
		//转义序列:
		System.out.println("123456789\t123\n");
		System.out.println("123456789\t123\n");
		System.out.println("123456789\b123\n");
		System.out.println("123456789\r123\n");
		System.out.println("123456789\f123\n");
		System.out.println("123456789\'123\n");
		System.out.println("123456789\"123\n");
	    System.out.println("123456789\\123");
		System.out.println("\n");
		
		//Character Method:
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isDigit('2'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('B'));
		System.out.println(Character.toUpperCase('d'));
		System.out.println(Character.toLowerCase('e'));
		System.out.println(Character.toString('H'));
	}
}