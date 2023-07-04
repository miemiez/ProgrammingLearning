public class TestString{
	public static void main(String[] args) {
		//String is unchangeable
		
		/*The first way to create String:
		Create String object*/
		String str01 = new String("Mr.Mmz");
		String str001 = new String("Mr.Mmz");
		String str0001 = "Mr.mmz";
		String str00001 = "Mr.mmz";
		System.out.println(str01 == str001);//Unequal addresses
		System.out.println(str0001 == str00001);
		System.out.println(str01 + "\n");
		
		/*The second way to create String:
		Create in the storage pool,if this String is detected,no new string will be created*/
		String str02 = "Mr.Shrimp";
		String str002 = "Mr.Shrimp";
		System.out.println(str02 == str002);
		System.out.println(str02 + '\n');
		
		//The third way to create String:
		char[] crabArray = {'M','r','.','C','r','a','b'};
		String str03 = new String(crabArray);
		System.out.println(str03);
		
		int length = str03.length();
		System.out.println("The length of str0 is " + length);
		
		System.out.println(str01+ '\t' + str02 + str03);
		System.out.println(str01.concat(str02));
	}
}