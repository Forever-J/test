import java.util.*;
import java.util.function.*;
public class CollectionStream
{
	public static void main(String[] args)
	{
		Collection books=new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���iOS����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Android����"));
		// ͳ����������������Ӵ���ͼ������
		System.out.println(books.stream()
			.filter(ele->((String)ele).contains("���"))
			.count()); // ���4
		// ͳ������������Java���Ӵ���ͼ������
		System.out.println(books.stream()
			.filter(ele->((String)ele).contains("Java") )
			.count()); // ���2
		// ͳ�������ַ������ȴ���10��ͼ������
		System.out.println(books.stream()
			.filter(ele->((String)ele).length() > 10)
			.count()); // ���2
		books.stream().mapToInt(ele->((String)ele).length()).forEach(obj->System.out.println("ֵ��"+obj));
	}
}