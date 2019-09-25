package lesson1;

public class Stack1 {

	private class Node {
		public int data;
		public Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node top;

	public void push(int data) {
		if (top == null) {
			top = new Node(data, null);
		} else {
			Node node = new Node(data, top);
			top = node;
		}

	}

	public int pop() {

		Node node = top;
		top = top.next;

		return node.data;
	}
}
