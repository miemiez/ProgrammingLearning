package Day13LinkedList;

public class NodeTest<E> {
	private E value;
	
	NodeTest<E> next;
	
	NodeTest<E> prev;
	
	public static void showNode(NodeTest<?> node) {
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	public static void addNode(NodeTest<String> endNode,NodeTest<String> newNode) {
		endNode.next = newNode;
	}
	
	public static void removeNode(NodeTest<String> node) {
		node.prev.next = node.next;
	}
	
	public static void main(String[] args) {
		NodeTest<String> node1 = new NodeTest<>();
		node1.value = "A";
		
		NodeTest<String> node2 = new NodeTest<>();
		node2.value = "B";
		node2.prev = node1;
		
		NodeTest<String> node3 = new NodeTest<>();
		node3.value = "C";
		node3.prev = node2;
		
		NodeTest<String> node4 = new NodeTest<>();
		node4.value = "D";
		
		node1.next = node2;
		node2.next = node3;
		showNode(node1);
		System.out.println();
		addNode(node3,node4);
		showNode(node1);
		removeNode(node2);
		System.out.println();
		showNode(node1);
		
	}
}
