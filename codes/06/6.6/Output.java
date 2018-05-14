
package lee;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public interface Output
{
	// �ӿ��ﶨ��ĳ�Ա����ֻ���ǳ���
	int MAX_CACHE_LINE = 5;
	// �ӿ��ﶨ�����ͨ����ֻ����public�ĳ��󷽷�
	void out();
	void getData(String msg);
	// �ڽӿ��ж���Ĭ�Ϸ�������Ҫʹ��default����
	default void print(String... msgs)
	{
		for (String msg : msgs)
		{
			System.out.println(msg);
		}
	}
	// �ڽӿ��ж���Ĭ�Ϸ�������Ҫʹ��default����
	default void test()
	{
		System.out.println("Ĭ�ϵ�test()����");
	}
	// �ڽӿ��ж����෽������Ҫʹ��static����
	static String staticTest()
	{
		return "�ӿ�����෽��";
	}
}