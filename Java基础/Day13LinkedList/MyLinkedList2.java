package Day13LinkedList;

public class MyLinkedList2<E> {
	private Node<E> first;
	private Node<E> last;
	private int size = 0;
	
	public int getSize() {
		return size;
	}
	
	private static class Node<E>{
		private E e;
		
		private Node<E> next;
		private Node<E> prev;
		
		public Node(Node<E> prev,E e,Node<E> next){
			this.prev = prev;
			this.e = e;
			this.next = next;
		}
	}
	
	public void myAdd(E e) {
		Node<E> l = last;
		Node<E> node = new Node<>(l,e,null);
		last = node;
		if(l == null) {
			first = node;
		}else {
			l.next = node;
		}
		size++;
	}
	
	public E myGet(int index) {
		if(index < size >> 1) {
			Node<E> node = first;
			for(int i = 0;i < index;i++) {
				node = node.next;
			}
			return node.e;
		}else {
			Node<E> node = last;
			for(int i = size - 1;i > index;i--) {
				node = node.prev;
			}
			return node.e;
		}
	}
	
	public void myRemove(Node<E> node) {//根据指针进行删除，时间复杂度为O(1)；
		Node<E> prevNode = node.prev;
		Node<E> nextNode = node.next;
		
		if(node.prev == null) {
			first = nextNode;
		}else if(node.next == null) {
			last = prevNode;
		}else {
			prevNode.next = nextNode;
			nextNode.prev = prevNode;
			node.prev = null;
			node.next = null;
		}
		node.e = null;
		size--;
	}
}
