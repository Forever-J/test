import java.util.*;
import java.util.function.*;
public class PredicateTest
{
	public static void main(String[] args)
	{
		Collection books=new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���iOS����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Android����"));
		books.removeIf(ele->((String)ele).length()<10);
		System.out.println(books);
	}
}
