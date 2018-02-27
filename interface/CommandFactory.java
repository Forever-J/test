public class CommandFactory
{
	private Command a;
	public CommandFactory(Command a)
	{
		this.a=a;
	}
	public void process(int[] target)
	{
		a.process(target);
	}
	public static void main(String[] args)
	{
		CommandFactory b=new CommandFactory(new AddCommand());
		int[] target={1,2,3,4,5,6};
		b.process(target);
	}
}