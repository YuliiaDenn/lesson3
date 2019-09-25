package lesson1;

public class MainStack {

	public static void main(String[] args) {

		Stack1 stack = new Stack1();

		stack.push(25);
		stack.push(28);
		stack.push(29);
		stack.push(40);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		Queue1 q = new Queue1();

		
			q.push(2);
			q.push(3);
			q.push(4);
		
		
			System.out.println(q.pop());
			System.out.println(q.pop());
			System.out.println(q.pop());
		

	}

}
