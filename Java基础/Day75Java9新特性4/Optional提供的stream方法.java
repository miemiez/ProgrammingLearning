package Day75Java9新特性4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Optional提供的stream方法 {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		Optional<List<String>> optional = Optional.ofNullable(list);
		Stream<List<String>> stream = optional.stream();
		Stream<String> stream2 = optional.stream().flatMap(x -> x.stream());
		stream.forEach(System.out::println);
		stream2.forEach(System.out::println);
	}
}
