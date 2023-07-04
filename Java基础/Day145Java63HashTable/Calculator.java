package Day145Java63HashTable;

public class Calculator{
	  public Calculator(){

	  }

	  public int add(int a, int b){
	    return a + b;
	  }

	  public int subtract(int a, int b){
	    return a - b;
	  }

	  public int multiply(int a, int b){
	    return a * b;
	  }

	  public int divide(int a, int b){
	    return a / b;
	  }

	  public int modulo(int a, int b){
	    return a % b;
	  }

	  public static void main(String[] args){
	    Calculator myCalculator = new Calculator();
	    int a = myCalculator.add(5,7);
	    int b = myCalculator.subtract(45,11);
	    System.out.println(a);
	    System.out.println(b);
	  }
	}