class StaticOut 
{
	static class StaticIn
	{
		public StaticIn()
		{
			System.out.println("��̬�ڲ���Ĺ�����");
		}
	}
}
public class CreateStaticInnerInstance
{
	public static void main(String[] args)
	{
		StaticOut.StaticIn in=new StaticOut.StaticIn();
	}
}

