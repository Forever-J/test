import java.util.*;
public class ForeachTest
{
	public static void main(String[] args)
	{
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		for(Object obj:books)
		{
			String book=(String)obj;
			System.out.println(book);
			if (book.equals("���Android����"))
			{
				// ʹ�õ��������У������޸ļ���Ԫ��,������������쳣
				books.remove(book);
			}
		}
	}
}
