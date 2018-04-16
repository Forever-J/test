import java.util.*;
public class EnumSetTest2
{
	public static void main(String[] args) 
	{
		Collection c=new HashSet();
		c.clear();
		c.add(Season.SPRING);
		c.add(Season.FALL);
		EnumSet es=EnumSet.copyOf(c);
		System.out.println(es);
		c.add("java");
		es=EnumSet.copyOf(c);
		System.out.println(es);
	}
}
