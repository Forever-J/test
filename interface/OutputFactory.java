
import j.Output;

public class OutputFactory
{

	public static void main(String[] args)
	{
		Computer c=new Computer(new BetterPrinter());
		c.keyIn("�򵥹���ģʽ��ϰ");
		c.keyIn("�򵥹���ģʽ��ϰ");
		c.print();
		Computer c1=new Computer();
		c1.out=new BetterPrinter();
	}
}
