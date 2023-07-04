public class TestAtm{
  public static int totalMoney = 0;
  
  public TestAtm(){
    totalMoney += 5;
  }
  
  public static void main(String[] args){
 
    System.out.println(TestAtm.totalMoney); 
    
    TestAtm myAtm = new TestAtm();
    System.out.println(TestAtm.totalMoney); 
    System.out.println(myAtm.totalMoney); 
    
    TestAtm mySecondAtm = new TestAtm();
    System.out.println(TestAtm.totalMoney); 
    System.out.println(myAtm.totalMoney); 
    System.out.println(mySecondAtm.totalMoney);
  }
}