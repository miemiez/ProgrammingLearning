public class Puppy {
	private int PuppyAge;
	public Puppy(String name) {
		System.out.println("Dog's name is " + name + " .");
	}
	
	public void setAge(int age) {
		PuppyAge = age;
	}
	
	public int getAge() {
		System.out.println("Dog's age is " + PuppyAge + " age.");
		return PuppyAge;
	}
	
	public static void main (String[] args) {
		Puppy myPuppy = new Puppy("Eddie");
		myPuppy.setAge(1);
		myPuppy.getAge();
		System.out.println("variable value is " + myPuppy.PuppyAge + ".");
	}
}