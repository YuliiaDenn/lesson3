package lesson1;

public class MyStack2 {

	private int[] arrayStack;
	private int top;
	private int maxSize;

	public MyStack2(int m) {
		this.maxSize = m;
		top = -1;
		arrayStack = new int[maxSize];

	}

	public void add(int data) {
		arrayStack[++top] = data;
	}

	public int delete() {
		return arrayStack[top--];
	}

	public int realTop() {
		return arrayStack[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull(){
		return (top==maxSize-1);
	}
}
