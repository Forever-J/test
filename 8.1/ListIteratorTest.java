import java.util.*;
public class ListIteratorTest
{
	public static void main(String[] args) 
	{
		String[] books={"java","ios","Andriod"};
		List bookList=new ArrayList();
		for(int i=0;i<books.length;i++)
		{
			bookList.add(books[i]);
		}
		ListIterator lit=bookList.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
			lit.add("--------分隔符--------");
		}
		System.out.println("====下面开始方向迭代====");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}
