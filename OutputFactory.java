
import j.Output;

public class OutputFactory
{
	public Output getOutput()
	{
		return new Printer();
	}
	public static void main(String[] args)
	{
		OutputFactory of=new OutputFactory();
		Computer c=new Computer(of.getOutput());
		c.keyIn("简单工厂模式练习");
		c.keyIn("简单工厂模式练习");
		c.print();
	}
}
