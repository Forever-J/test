public class FinalizeTest
{
	private static FinalizeTest ft=null;
	public void info()
	{
		System.out.println("������Դ������finalize����");
	}
	public static void main(String[] args) throws Exception
	{
		new FinalizeTest();
		System.gc();
		//Runtime.getRuntime().runFinalization();
		//System.runFinalization();
		ft.info();
	}
	public void finalize()
	{
		ft=this;
	}
}