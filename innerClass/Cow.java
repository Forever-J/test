public class Cow
{
	private double weight;
	private Cow(){}
	private Cow(double weight)
	{
		this.weight=weight;
	}
	private class CowLeg
	{
		private double length;
		private String color;
		public CowLeg(){}
		public CowLeg(double length,String color)
		{
			this.length=length;
			this.color=color;
		}
		public void info()
		{
			System.out.println("��ǰţ�ȵ���ɫ�ǣ�"+color+",��"+length);
			System.out.println("��ţ��������ţ�أ�"+weight);
		}
	}
	public void test()
	{
		CowLeg cl=new CowLeg(1.12,"�ڰ����");
		cl.info();
	}
	public static void main(String[] args)
	{
		Cow cow=new Cow(378.9);
		cow.test();
	}
}