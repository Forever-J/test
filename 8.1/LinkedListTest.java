import java.util.*;
public class LinkedListTest
{
	public static void main(String[] args) 
	{
		LinkedList books=new LinkedList();
		books.offer("java");
		books.offer("ios");
		books.offer("Andriod");
		for(int i=0;i<books.size();i++)
		{
			System.out.println(books.get(i));
		}
		System.out.println(books.peekFirst());
		System.out.println(books.peekLast());
		System.out.println(books.pop());
		System.out.println(books);
		System.out.println(books.pollLast());
		System.out.println(books);
	}
}
