public class TestFindPrimeNumbers{
	public static void main(String[] args) {
		TestFindPrimeNumbers t = new TestFindPrimeNumbers();
		t.forPN(10,100);
	}
	
	public void forPN(int i, int i1) {
		int count = 0;
		int minus = i1 - i; 
		while(i < i1){
			boolean b = true;
			for(int j = 2;j < i;j++) {
				if(i % j == 0) {
					b = false;
					break;
				}
			}
			if (b == true) {
				System.out.println(i + "是质数");
				count++;
			}
			i++;
		}
		System.out.println((i1 - minus) + "到" + i1 + "之间" +"一共有" + count + "个质数");
	}
}