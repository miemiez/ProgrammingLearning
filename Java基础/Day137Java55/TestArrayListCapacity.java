package Day137Java55;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TestArrayListCapacity {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(getArrayListCapacity((ArrayList<String>) list));
		list.add("a");
		list.add("b");
		System.out.println(getArrayListCapacity((ArrayList<String>) list));
		list.add("c");
		System.out.println(getArrayListCapacity((ArrayList<String>) list));
	}
	
	public static <T> int getArrayListCapacity(ArrayList<T> arrayList) {
		@SuppressWarnings("rawtypes")
		Class<ArrayList> c = ArrayList.class;
		Object[] tArr = null;
		try {
			Field f = c.getDeclaredField("elementData");
			f.setAccessible(true);
			try {
				tArr = (Object[]) f.get(arrayList);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tArr.length;
	}
}
