package lesson1;

public class MyQueue {

	private int size;
	private int head;
	private int tail;
	private int[] queue;

	MyQueue(int size) {
		queue = new int[this.size = size];
	}

	public void add(int data) {

		if (++tail == size) {
			tail = 0;
		}
		queue[tail] = data;

	}

	public int get() {

		if (++head == size) {
			head = 0;
		}

		return queue[head];
	}
	
	public boolean isEmpty(){
		return head==tail;
	}
}
