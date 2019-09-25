package lesson1;

public class Main4 {

	public static void main(String[] args) {
		Queue queue = new Queue(20);

		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);

		while (!queue.ifEmpty()) {
			System.out.println(queue.get());
		}
		System.out.println();

		Stack stack = new Stack();
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		
		ArrayStack array = new ArrayStack(10);
		
		array.add(7);
		array.add(8);
		array.add(9);
		
		while(!array.isEmpty()){
			System.out.println(array.get());
		}
	}

}
