
import j.Output;

public class OutputFactory
{

	public static void main(String[] args)
	{
		Computer c=new Computer(new Printer());
		c.keyIn("�򵥹���ģʽ��ϰ");
		c.keyIn("�򵥹���ģʽ��ϰ");
		c.print();
	}
}
