
import j.Output;

public class OutputFactory
{

	public static void main(String[] args)
	{
		Computer c=new Computer(new Printer());
		c.keyIn("简单工厂模式练习");
		c.keyIn("简单工厂模式练习");
		c.print();
	}
}
