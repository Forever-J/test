class Out 
{
	class In
	{
		public In(String msg)
		{
			System.out.println(msg);
		}
	}
}
public class CreateInnerInstance
{
	public static void main(String[] args)
	{
		Out.In in=new Out().new In("�����ⲿ�ഴ���ڲ���ʵ��");
		Out.In in1;
		Out out=new Out();
		in1=out.new In("����");
	}
}