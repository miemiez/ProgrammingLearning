package Day145Java63HashTable;

/* Computer.java */
import java.io.*;
 
public class Computer implements Serializable {
  private static final long serialVersionUID = 1L;
  Keyboard keyboard;
  Monitor monitor;
 
  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.keyboard = new Keyboard("BWM");
    computer.monitor = new Monitor("BYD",9999999);
    try {
      FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\12852\\Desktop\\Serilization\\computerStorage.txt");
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(computer);
      try {
    	FileInputStream fis = new FileInputStream("C:\\Users\\12852\\Desktop\\Serilization\\computerStorage.txt");
    	ObjectInputStream objectInputStream = new ObjectInputStream(fis);
    	computer = null;
		computer = (Computer)objectInputStream.readObject();
		System.out.println(computer.keyboard);
		System.out.println(computer.monitor);
      } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
      }
    } catch (IOException e) {
      System.out.println("Something went wrong...");
    }
    System.out.println("Everything is good here! Serialization complete!");
  }
}
 
 
class IODevices implements Serializable {
  private static final long serialVersionUID = 1L;
}
 
/* Keyboard.java */
class Keyboard extends IODevices {
  String brand;
  public Keyboard(String brand) {
	  this.brand = brand;
  }
  public String toString() {
	  return "品牌=" + brand;
  }
}
 
class Monitor extends IODevices {
  String brand;
  int price;
  
  public Monitor(String brand,int price) {
	  this.brand = brand;
	  this.price = price;
  }
  public String toString() {
	  return "品牌=" + brand + ";价格=" + price;
  }
}