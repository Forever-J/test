import java.util.*;
public class IteratorEach
{
	public static void main(String[] args)
	{
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		Iterator it=books.iterator();
		it.forEachRemaining(obj->System.out.println("��������Ԫ�أ�"+obj));
	}
}