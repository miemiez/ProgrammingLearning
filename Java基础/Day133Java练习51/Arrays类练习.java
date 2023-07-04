package Day133Java练习51;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

public class Arrays类练习 {
	public static void main(String[] args) {
		/*
		 * 自定义Book类，里面包含name和price，按price,name长度进行排序。
		 * 要求使用两种方式排序，对对象的某个属性排序，有一个Book[] books = 5本书对象
		 * 
		 * 使用前面学习过的传递，实现Comparator接口匿名内部类，也称之为定制排序。
		 */
		Book[] books = new Book[5];
		books[0] = new Book("红楼梦",59.9);
		books[1] = new Book("三国演义",89.9);
		books[2] = new Book("西游记",39.9);
		books[3] = new Book("水浒传",109.9);
		books[4] = new Book("吾輩は猫である",79.9);
		try {
			displayArray(books);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * 按价格从低到高排序
		 */
		sortByPrice(books,(Double d1,Double d2) -> (int) (d1 - d2));
		try {
			displayArray(books);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * 按照书名长度从长到短进行排序
		 */
		sortByBNL(books,(Integer i1,Integer i2) -> i2 - i1);
		try {
			displayArray(books);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sortByPrice(Book[] books,Comparator<Double> c){//价格排序
		Book temp = null;
		for(int i = 0;i < books.length - 1;i++) {
			for(int j = 0;j < books.length - 1 - i;j++) {
				if(c.compare(books[j].getPrice(),books[j+1].getPrice()) > 0) {
					temp = books[j];
					books[j] = books[j+1];
					books[j+1] = temp;
				}
			}
		}
	}
	
	public static void sortByBNL(Book[] books,Comparator<Integer> c) {//书名长度排序
		Book temp = null;
		for(int i = 0;i < books.length;i++) {
			for(int j = 0;j < books.length - 1 - i;j++) {
				if(c.compare(books[j].getName().length(),books[j+1].getName().length()) > 0) {
					temp = books[j];
					books[j] = books[j+1];
					books[j+1] = temp;
				}
			}
		}
	}
	
	public static <T> void displayArray(T[] tArr) 
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Class<? extends Object> c = tArr[0].getClass();
		Field[] fs = c.getDeclaredFields();
		String[] strArr = new String[fs.length];
		Method[] ms = new Method[fs.length];
		for(int i = 0;i < fs.length;i++) {
			strArr[i] = "get" + fs[i].getName().substring(0,1).toUpperCase() + fs[i].getName().substring(1);
			ms[i] = c.getDeclaredMethod(strArr[i]);
		}
		
		System.out.print("{");
		for(int i = 0;i < tArr.length;i++) {
			for(int j = 0;j < fs.length;j++) {
				if(i == tArr.length - 1) {
					if(j == fs.length - 1) {
						System.out.print(ms[j].invoke(tArr[i]));
						break;
					}
					System.out.print(ms[j].invoke(tArr[i]) + ",");
				}else {
					if(j == fs.length - 1) {
						System.out.print(ms[j].invoke(tArr[i]) + ";");
						break;
					}
					System.out.print(ms[j].invoke(tArr[i]) + ",");
				}
			}
		}
		System.out.println("}");
	}
}

class Book{
	private String name;
	private Double price;
	
	public Book(String name,double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}