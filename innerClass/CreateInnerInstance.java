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
		Out.In in=new Out().new In("测试外部类创建内部类实例");
		Out.In in1;
		Out out=new Out();
		in1=out.new In("测试");
	}
}