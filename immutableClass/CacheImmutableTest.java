class CacheImmutable
{
	private static int MAX_SIZE=10;
	private static CacheImmutable[] cache=new CacheImmutable[MAX_SIZE];
	private static int pos=0;
	private final String name;
	private CacheImmutable(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public static CacheImmutable valueOf(String name)
	{
		for(int i=0;i<MAX_SIZE;i++)
		{
			if(cache[i]!=null&&cache[i].getName().equals(name))
			{
				return cache[i];
			}
		}
			// 如果缓存池已满
		if (pos == MAX_SIZE)
		{
			// 把缓存的第一个对象覆盖，即把刚刚生成的对象放在缓存池的最开始位置。
			cache[0] = new CacheImmutable(name);
			// 把pos设为1
			pos = 1;
		}
		else
		{
			// 把新创建的对象缓存起来，pos加1
			cache[pos++] = new CacheImmutable(name);
		}
		return cache[pos - 1];

	}
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if (obj != null && obj.getClass() == CacheImmutable.class)
		{
			CacheImmutable ci = (CacheImmutable)obj;
			return name.equals(ci.getName());
		}
		return false;
	}
	public int hashCode()
	{
		return name.hashCode();
	}
}
public class CacheImmutableTest
{
	public static void main(String[] args)
	{
		CacheImmutable c1 = CacheImmutable.valueOf("hello");
		CacheImmutable c2 = CacheImmutable.valueOf("hello");
		// 下面代码将输出true
		System.out.println(c1 == c2);
	}
}