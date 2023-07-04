package Day19HashMap04;

public class SolveHashConflict {
	public static void main(String[] args) {
		MyHashMap2<Object,Object> myHashMap2 = new MyHashMap2<>();
		myHashMap2.put("a", "a");
		myHashMap2.put(97, 97);
		
		System.out.println(myHashMap2.get("a"));//a
		System.out.println(myHashMap2.get(97));//97
	}
}
