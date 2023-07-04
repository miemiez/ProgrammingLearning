package Day137Java55;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class List排序练习 {
	public static void main(String[] args) {
		Book b1 = new Book("红楼梦","曹雪芹",(short) 100);
		Book b2 = new Book("西游记","吴承恩",(short) 10);
		Book b3 = new Book("水浒传","施耐庵",(short) 9);
		Book b4 = new Book("三国演义","罗贯中",(short) 80);
		List<Book> list = new ArrayList<>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		sort(list,(Short d1,Short d2) -> d1 - d2);
		System.out.println(list);
	}
	
	public static void sort(List<Book> list,Comparator<Short> c) {
		Book temp = null;
		for(int i = 0;i < list.size() - 1;i++) {
			for(int j = 0;j < list.size() - 1 - i;j++) {
				if(c.compare(list.get(j).getPrice(), list.get(j+1).getPrice()) > 0) {
					temp = list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}
	}
}

class Book{
	private String name;
	private String writer;
	private short price;
	
	public Book(String name,String writer,short price) {
		super();
		this.name = name;
		this.writer = writer;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getPrice() {
		return price;
	}

	public void setPrice(short price) {
		this.price = price;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", writer=" + writer + ", price=" + price + "]";
	}
}
