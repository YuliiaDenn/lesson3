package lesson1;

public class Stack {

	private class Node {
		private int data;
		private Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node top;

	public void push(int data) {
		if (top == null) {
			top = new Node(data, null);
		}
		Node node = new Node(data, top);
		top = node;
	}

	public int pop() {

		Node node = top;
		top = top.next;
		return node.data;
	}

}
