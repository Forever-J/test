import java.util.*;
public class CollectionEach
{
	public static void main(String[] args)
	{
	Collection books=new HashSet();
	books.add("javaset");
	books.add("Geek");
	books.add("joe");
	books.forEach(obj->System.out.println("迭代集合的元素："+obj));
	}
}  
