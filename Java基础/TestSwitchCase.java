public class TestSwitchCase{
	public static void main(String[] args) {
		char grade = 'C';
		
		switch(grade)
		{
		case 'A' :
			System.out.println("Wonderful");
			break;
		case 'B' :
		case 'C' :
			System.out.println("Good");
			break;
		case 'D' :
			System.out.println("Common");
			break;
		default :
			System.out.println("Fail");
		}
		System.out.println("Grade is " + grade);
	}
}