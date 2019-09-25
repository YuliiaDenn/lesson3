package lesson1;

public class Main3 {

	public static void main(String[] args) {

		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();

		MyStack2 array = new MyStack2(20);

		array.add(23);
		array.add(25);
		array.add(71);

		while (!array.isEmpty()) {
			int value = array.delete();
			System.out.println(value);
		}
		System.out.println();
		
		MyQueue queue = new MyQueue(10);
		queue.add(25);
		queue.add(8);
		queue.add(58);
		queue.add(61);
		
		while (!queue.isEmpty()) {
			int value = queue.get();
			System.out.println(value);
		}
		System.out.println();
		
		
		
		

	}

}
