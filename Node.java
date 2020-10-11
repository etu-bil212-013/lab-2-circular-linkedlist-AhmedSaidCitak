public class Node {
	
	private int element;
	private Node next;
	
	public Node(int e) {
		element = e;
	}
	
	public int getElement() {
		return element;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setElement(int e) {
		element = e;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
}