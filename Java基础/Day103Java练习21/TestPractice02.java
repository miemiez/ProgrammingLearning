package Day103Java练习21;

public class TestPractice02 {
	public static void main(String[] args) {
		Practice02Person[] personArr = new Practice02Person[4];
		personArr[0] = new Practice02Student("XYY","男",17,001);
		personArr[1] = new Practice02Student("MYY","女",18,002);
		personArr[2] = new Practice02Teacher("CZ","男",58,32);
		personArr[3] = new Practice02Teacher("RMM","女",28,2);
		TestPractice02 t = new TestPractice02();
		t.sort(personArr);
		for(int i = 0;i < personArr.length;i++) {
			System.out.println(personArr[i]);
			t.callSubclass(personArr[i]);
		}
	}
	
	public void sort(Practice02Person[] pArr) {
		Practice02Person p = null;
		for(int i = 0;i < pArr.length - 1;i++) {
			for(int j = 0;j < pArr.length - 1 - i;j++) {
				if(pArr[j].getAges() < pArr[j + 1].getAges()) {
					p = pArr[j];
					pArr[j] = pArr[j + 1];
					pArr[j + 1] = p;
				}
			}
		}
	}
	
	public void callSubclass(Practice02Person p) {
		if(p instanceof Practice02Student) {//如果p的运行类型为Practice02Student
			((Practice02Student)p).study();
		}else if(p instanceof Practice02Teacher) {
			((Practice02Teacher)p).teach();
		}else {
			System.out.println("传入数据不为学生或老师");
		}
	}
}
