package Day115Java练习33;

public class 练习02 {
	public static void main(String[] args) {
		System.out.println(Frock.getNextNum());//100100
		System.out.println(Frock.getNextNum());//100200
		Frock f1 = new Frock();
		System.out.println(f1.getSerialNumber());//100300
		Frock f2 = new Frock();
		System.out.println(f2.getSerialNumber());//100400
		Frock f3 = new Frock();
		System.out.println(f3.getSerialNumber());//100500
	}
}

class Frock{
	private static int currentNum = 100000;
	private int serialNumber;
	
	public Frock() {
		serialNumber = getNextNum();
	}
	
	public static int getNextNum() {
		currentNum += 100;
		return currentNum;
	}

	public int getSerialNumber() {
		return serialNumber;
	}
}
