import java.util.*;
import java.util.function.*;
public class CollectionStream
{
	public static void main(String[] args)
	{
		Collection books=new HashSet();
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂iOS讲义"));
		books.add(new String("疯狂Ajax讲义"));
		books.add(new String("疯狂Android讲义"));
		// 统计书名包含“疯狂”子串的图书数量
		System.out.println(books.stream()
			.filter(ele->((String)ele).contains("疯狂"))
			.count()); // 输出4
		// 统计书名包含“Java”子串的图书数量
		System.out.println(books.stream()
			.filter(ele->((String)ele).contains("Java") )
			.count()); // 输出2
		// 统计书名字符串长度大于10的图书数量
		System.out.println(books.stream()
			.filter(ele->((String)ele).length() > 10)
			.count()); // 输出2
		books.stream().mapToInt(ele->((String)ele).length()).forEach(obj->System.out.println("值："+obj));
	}
}