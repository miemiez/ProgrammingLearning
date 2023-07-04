package Day139Java练习57LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class LinkedList底层结构 {
	static Node first = null;//让first引用指向tom，就是双向链表的头节点
	static Node last = null;//让first引用指向jacy，就算双向链表的尾节点
	public static void main(String[] args) {
		/*
		 * LinkedList的全面说明
		 *     （1）LinkedList底层实现了双向链表和双端队列特点
		 *     （2）可以添加任意元素（元素可以重复），包括null
		 *     （3）线程不安全，没有实现同步
		 */
		
		/*
		 * LinkedList的底层操作机制
		 *     （1）LinkedList底层维护了应该双向链表
		 *     （2）LinkedList中维护了两个属性first和last分别指向，首节点和尾节点
		 *     （3）每个节点（Node对象），里面又维护了prev，next，item三个属性，其中通过
		 *          prev指向前一个，通过next指向后一个节点。最终实现双向链表
		 *     （4）所以LinkedList的元素的添加和删除，不是通过数组完成的，相对来说效率较高
		 *     （5）模拟一个简单的双向链表。【代码】
		 */
		
		List<String> l = new LinkedList<>();
		l.add("a");
		l.add("e");
		List<String> arr = new ArrayList<>();
		arr.add("b");
		arr.add("c");
		arr.add("d");
		l.addAll(1,arr);
		System.out.println(l.indexOf("b"));
		int i = 0;
		for(String s:l) {
			
			System.out.println(l.get(i++));
		}
		
		
		Node tom = new Node("Tom");
		Node jack = new Node("Jack");
		Node jacy = new Node("Jacy");
		first = tom;//让first引用指向tom，就是双向链表的头节点
		last = jacy;//让first引用指向jacy，就算双向链表的尾节点
		
	    //连接三个节点，形成双向链表
		tom.next = jack;
		jack.next = jacy;
		jacy.prev = jack;
		jack.prev  = tom;
		
		//演示双向链表，添加和删除数据的方便性
		Node jerry = new Node("Jerry");
		add(jerry);
		
		
		//从头到尾进行遍历
		while(true) {
			if(first == null) {
				break;
			}
			System.out.println(first);
			first = first.next;
		}
		
		remove(tom);
		//从尾到头进行遍历
		while(true) {
			if(last == null) {
				break;
			}
			System.out.println(last);
			last = last.prev;
		}
	}
	
	public static void add(Node n1) {
		if(first == null) {
			first = n1;
			last = n1;
		}
		n1.prev = last;
		last.next = n1;
		last = n1;
	}
	
	public static void remove(Node n1) {
		Node prev = n1.prev;
		Node next = n1.next;
		if(prev == null) {
			first = next;
			first.prev = null;
			n1.next = null;
		}else if(next == null) {
			last = prev;
			last.next = null;
			n1.prev = null;
		}else {
			prev.next = next;
			next.prev = prev;
			n1.next = null;
			n1.prev = null;
		}
		
	}
}

class Node{
	public Object item;
	public Node next;
	public Node prev;
	
	public Node(Object name) {
		this.item = name;
	}
	
	public String toString() {
		return "Node name = " + item;
	}
}