package Day136Java练习54;

public class TestP {
	public static void main(String[] args) {
		PersonNewHCAndEQ p1 = new PersonNewHCAndEQ("lhy",19);
		PersonNewHCAndEQ p2 = new PersonNewHCAndEQ("lhy",19);
		System.out.println(p1.equals(p2));//true
		System.out.println(p1.hashCode() == p2.hashCode());//true
		System.out.println(p1==p2);//false
	}
}
