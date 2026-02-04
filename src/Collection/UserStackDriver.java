package Collection;

public class UserStackDriver {
	public static void main(String[] args) {
		UserStack<Integer> stack = new UserStack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		stack.push(101);
		System.out.println(stack);
		System.out.println(stack.search(50));
		System.out.println(stack.peek());
		System.out.println(stack.empty());
		System.out.println(stack.pop());
	}

}
