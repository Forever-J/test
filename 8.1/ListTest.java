import java.util.*;
class A 
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class ListTest
{
	public static void main(String[] args)
	{
		List books=new ArrayList();
		books.add(new String("java"));
		books.add(new String("ajax"));
		books.add(new String("js"));
		System.out.println(books);
		books.remove(new A());
		System.out.println(books);
		books.remove(new A());
		System.out.println(books);
	}
}
