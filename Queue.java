package lesson1;

public class Queue {

	private int size;
	private int head;
	private int tail;
	private int[] node;

	Queue(int size) {
		node = new int[this.size = size];
	}

	public void add(int data) {
		if (++tail == size) {
			tail = 0;
		} else {
			node[tail] = data;
		}
	}

	public int get() {
		if (++head == size) {
			head = 0;
		}
			return node[head];	
	}
	
	public boolean ifEmpty(){
		
			return head==tail;
		
	}

}
