import java.util.*;
public class ListTest2
{
	public static void main(String[] args) 
	{
		List books=new ArrayList();
		books.add(new String("java"));
		books.add(new String("ios"));
		books.add(new String("Andriod"));
		books.add(new String("javaee"));
		books.sort((o1,o2)->((String)o1).length()-((String)o2).length());
		System.out.println(books);
		books.replaceAll(ele->((String)ele).length());
		System.out.println(books);
	}
}  

