package lesson1;

public class ArrayStack {

	private int[] array;
	private int size;
	private int top;

	ArrayStack(int size) {
		this.size = size;
		array = new int[this.size];
		top = -1;
	}

	public void add(int data) {
		array[++top] = data;
	}

	public int get() {
		return array[top--];
	}

	public boolean isEmpty() {
		return (top == -1);
	}
}
