public class CircularLinkedList {
	
	private Node head;
	private Node last;
	private int size;
	
	public CircularLinkedList() {
		head = null;
		last = null;
		size = 0;
	}
	
	public void add(int number) {
		Node newNode = new Node(number);
		if(head == null) {
			head = newNode;
			last = newNode;
			newNode.setNext(newNode);
			size++;
		}
		else {
			newNode.setNext(head);
			last.setNext(newNode);
			last = newNode;
			size++;
		}
	}
	
	public int delete(int position) {
		Node prevNode = last;
//		prevNode = last;
		Node currNode = head;
//		currNode = head;
//		position = position % size;
		
		for(int i=1; i<position; i++) {			// after this loop, currNode points the node that will be deleted
			currNode = currNode.getNext();
			prevNode = prevNode.getNext();
		}
//		System.out.println(currNode.getElement() + " ***");
		if(currNode == head) {						// deleting from head
			head = currNode.getNext();
			prevNode.setNext(currNode.getNext());
		}
		else if(position == size) {				// deleting from tail
			last = prevNode;
			prevNode.setNext(currNode.getNext());
		}
		else {									// deleting from somewhere in middle
			prevNode.setNext(currNode.getNext());
		}
		size--;
		return currNode.getElement();
	}
	
	public String toString() {
		Node currNode = head;
//		currNode = head;
		String output = "\"";
		
		for(int i=0; i<size; i++) {
			output += currNode.getElement() + " ";
			currNode = currNode.getNext();
		}
		
		output = output.substring(0, output.length()-1) + "\"";
		return output;
	}
	
	public String calculate(int howMany, int position) {
		for(int i=0; i<howMany; i++) {
			if(howMany > size && i==0)
				return "Error: linkedlist is too small.";
			delete(position);
			System.out.println(toString());
			if(size == 0)
				return "Linkedlist is now empty.";
		}
		return toString();
	}
}