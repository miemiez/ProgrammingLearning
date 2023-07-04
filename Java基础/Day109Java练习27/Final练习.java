package Day109Java练习27;

public class Final练习 {
	public int addOne(final int x) {//下面的两句代码第一句有误，第二句正确
		//++x;//错误，因为final修饰的值x，不能再进行值的修改了
		return x + 1;
	}
}
