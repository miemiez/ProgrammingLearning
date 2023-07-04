package Day73Java9新特性02;

import java.util.HashSet;
import java.util.Set;

public class 钻石操作符的使用升级 {
	/*
	 * 例：
	 *     SET<String> set = new HashSet<>(){};  //会自动推断类型了，不用在后面的<>中填入引用类型了，
	 *                                           //并且，可以在末尾加入方法体，形成匿名内部类
	 */
	Set<String> set = new HashSet<>(){};
}
