package Day13LinkedList;

public class MyLinkedList<E> {
	private Node<E> first;//链表的头节点
	private Node<E> last;//链表的尾节点
	private int size = 0;
	
	public int getSize() {
		return size;
	}
	
	private static class Node<E>{
		private E value;
		
		private Node<E> next;
		private Node<E> prev;
		
		public Node(Node<E> prev,E value,Node<E> next) {
			this.prev = prev;//当前节点的上一个节点
			this.value = value;//当前节点的值
			this.next = next;//当前节点的下一个节点
		}
	}

	public void add(E e) {
		Node<E> l = last;//获取当前链表中的最后一个节点
		Node<E> newNode = new Node<>(l,e,null);
		last = newNode;
		if(l == null) {
			//如果在链表中没有最后一个节点的话，链表是为空
			first = newNode;
		}else {
			l.next = newNode;
		}
		size++;
	}
}
