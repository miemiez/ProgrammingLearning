package Day92Java练习10;

public class Practice01汉诺塔 {
	public static void main(String[] args) {
		T t = new T();
		t.move(3, 'A','B','C');
	}
}

class T{
	public void move(int num,char a,char b,char c) {//num表示要移动的个数，a，b，c分别表示A塔，B塔，C塔
		if(num == 1) {
			System.out.println(a + "->" + c);
		}else {
			//如果有多个盘，可以看成两个，最下面和上面的所有盘（num-1)
			//（1）先移动上面所有的盘到b，借助c
			move(num - 1,a,c,b);
			//（2）把最下面的盘，移动到c
			System.out.println(a + "->" + c);
			//（3）再把b塔的所有盘移动到c，借助a
			move(num - 1,b,a,c);
		}
	}
}