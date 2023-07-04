package Day86Java练习04;

public class Practice04 {
	public static void main(String[] args) {
		for(char c1 = 'a';c1 <= 'z';c1++) {
			System.out.print(c1 + ',');
		}
		System.out.println();
		for(char c1 = 'Z';c1 >= 'A';c1--) {
			System.out.print(c1 + ',');
		}
	}
}
