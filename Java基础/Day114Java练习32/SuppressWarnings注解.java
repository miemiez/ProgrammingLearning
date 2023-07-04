package Day114Java练习32;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings注解 {
	/*
	 * 1.当我们不希望看到这些警告的时候，可以使用SuppressWarnings注解来抑制警告信息
	 * 2.在{""}中，可以写入你希望抑制（不显示）警告信息
	 * 3.关于SuppressWarnings作用范围是和你放置的位置相关
	 *   比如@SuppressWarnings 放置在main方法上，那么抑制警告的范围就是main
	 *   通常我们可以放置在具体的语句，方法，类（或者更大的范围上）
	 * 4.unchecked 是忽略没有检查的警告
	 *   rawtypes 是忽略没有指定泛型的警告（传参时没有指定泛型的警告错误）
	 *   unused 是忽略没有使用某个变量的警告错误
	 * 5.生成@SuppressWarnings 时，不用背，直接点击左侧的黄色提示，就可以选择（注意可以指定生成的位置）
	 * 6.@SuppressWarnings 可以修饰的程序元素为，查看@Target
	 *   
	 */
	@SuppressWarnings({"all","rawtypes","unchecked"})
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		list.add("XYY");
		list.add("LYY");
		list.add("FYY");
		@SuppressWarnings("unused")
		int i;
		System.out.println(list.get(1));
	}
}
