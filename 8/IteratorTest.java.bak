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
			book="测试字符串";
		}
	/*	while(it.hasNext())
		{
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("疯狂Android讲义"))
			{
				// 使用Iterator迭代过程中，不可修改集合元素,下面代码引发异常
				books.remove(book);
			}
		}*/
		System.out.println(books);
	}
}
