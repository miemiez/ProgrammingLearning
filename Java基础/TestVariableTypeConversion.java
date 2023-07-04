public class TestVariableTypeConversion{
	public static void main(String[] args) {
		//Implicit Conversion(小 ==> 大):
		int a = 1;
		float b = 2.2f;
		double c = 3.3;
		System.out.println(a + b + c);//Variable type is double;
		
		byte d = 1;
		short e = 2;
		char f = '1';
		System.out.println(e + d + f);//byte,short,char auto==> int ==> operate;
		
		//Mandatory Conversion(大 ==> 小):
		int g = 44;
		byte h = (byte)g;
		System.out.println(h);
		
		byte i = 22;
		byte j = 11;
		int k = i - j;//int type
		byte l = (byte)(i+j);//byte type
		System.out.println(k);
		System.out.println(l);
	}
}