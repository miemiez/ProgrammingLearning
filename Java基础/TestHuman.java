public class TestHuman{
  public String name;
  public int i = 10;
   
  public TestHuman(String inputName){
    this.name = inputName;
  }
  
  public void sayName(String name){
    System.out.println("My name is " + name);
  }
  
  public static void main(String[] args){
    TestHuman hero = new TestHuman("Clark Kent");
    hero.sayName("Superman");
    System.out.println(hero.i);
  }
}