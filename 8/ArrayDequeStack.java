import java.util.*;
public class ArrayDequeStack 
{
	public static void main(String[] args) 
	{
		ArrayDeque stack=new ArrayDeque();
		stack.push("java");
		stack.push("ios");
		stack.push("Andriod");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.remove("java"));
				System.out.println(stack);

	}
}
