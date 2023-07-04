package Day95Java练习13;

public class Practice02 {
	public static void main(String[] args) {
		Practice02 p = new Practice02();
		String[] arr = {"a","b","c","d","e","f","g"};
		int i = p.find(arr, "e");
		System.out.println(i);
	}
	
	public int find(String[] arr,String str) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == str) {
				return i;
			}
		}
		return -1;
	}
}
