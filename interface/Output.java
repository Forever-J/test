
package j;
public interface Output
{
	int MAX_CACHE_LINE=1;
	void out();
	void getData(String msg);
	default void print(String... msgs)
	{
		for(String msg:msgs)
		{
			System.out.println(msg);
		}
	}
	default void test()
	{
		System.out.println("Ĭ�ϵ�test����");
	}
	static String staticTest()
	{
		return "�ӿ�����෽��";
	}
}