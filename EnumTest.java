public class EnumTest
{
	public void judge(SeasonEnum s)
	{
		switch(s)
		{
			case SPRING:
				System.out.println("��ů����������̤�ࡣ");
				break;
			case SUMMER:
				System.out.println("�������ף��ʺ���Ӿ��");
				break;
			case FALL:
				System.out.println("�����ˬ��������ʱ��");
				break;
			case WINTER:
				System.out.println("�����Ϻ���Χ¯��ѩ��");
				break;
		}
	}
	public static void main(String[] args)
	{
		for(SeasonEnum s:SeasonEnum.values())
		{
			System.out.println(s);
		}
		new EnumTest().judge(SeasonEnum.SPRING);
	}
}