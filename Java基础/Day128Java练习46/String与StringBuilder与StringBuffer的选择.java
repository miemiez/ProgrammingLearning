package Day128Java练习46;

public class String与StringBuilder与StringBuffer的选择 {
	/*
	 * 1.如果字符串存在大量的修改操作，一般使用StringBuffer或StringBuilder
	 * 2.如果字符串存在大量的修改操作，并在单线程的情况下，使用StringBuilder
	 * 3.如果字符串存在大量的修改操作，并在多线程的情况下，使用StringBuffer
	 * 4.如果字符串很少修改，且被多个对象引用时，使用String，比如配置信息
	 */
}
