import java.util.*;
public class ForeachTest
{
	public static void main(String[] args)
	{
		Collection books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		for(Object obj:books)
		{
			String book=(String)obj;
			System.out.println(book);
			if (book.equals("疯狂Android讲义"))
			{
				// 使用迭代过程中，不可修改集合元素,下面代码引发异常
				books.remove(book);
			}
		}
	}
}
