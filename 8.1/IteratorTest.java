import java.util.*;
public class IteratorTest
{
	public static void main(String[] args)
	{
		Collection books=new HashSet();
		books.add("javaset");
		books.add("Geek");
		books.add("joe");
		Iterator it=books.iterator();
		while(it.hasNext())
		{
			String book=(String)it.next();
			System.out.println(book);
			if(book.equals("Geek"))
			{
				it.remove();
			}
			book="�����ַ���";
		}
	/*	while(it.hasNext())
		{
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("���Android����"))
			{
				// ʹ��Iterator���������У������޸ļ���Ԫ��,������������쳣
				books.remove(book);
			}
		}*/
		System.out.println(books);
	}
}
