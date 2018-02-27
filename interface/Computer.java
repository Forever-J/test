import j.Output;

public class Computer
{
	private Output out;
	public Computer(){}
	public Computer(Output out)
	{
		this.out=out;
	}
	public void keyIn(String msg)
	{
		out.getData(msg);
	}
	public void print()
	{
		out.out();
	}
	public static void main(String[] args)
	{
		Computer c=new Computer(new BetterPrinter());
		c.keyIn("简单工厂模式练习");
		c.keyIn("简单工厂模式练习");
		c.print();
	}
}  

