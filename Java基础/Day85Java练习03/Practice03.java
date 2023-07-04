package Day85Java练习03;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入字符");
		char ch = s.next().charAt(0);
		switch(ch) {
		    case 'a':
		    	ch = 'A';
		    	System.out.println(ch);
		    	break;
		    case 'b':
		    	ch = 'B';
		    	System.out.println(ch);
		    	break;
		    case 'c':
		    	ch = 'C';
		    	System.out.println(ch);
		    	break;
		    case 'd':
		    	ch = 'D';
		    	System.out.println(ch);
		    	break;
		    case 'e':
		    	ch = 'E';
		    	System.out.println(ch);
		    	break;
		    default:
		    	System.out.println("ohter");
		}
		s.close();
	}
}
