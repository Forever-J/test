public class SubClass extends Out.In
{
	public SubClass(Out out)
	{
		out.super("hello��fuck");
	}
	public static void main(String[] args)
	{
		Out out=new Out();
		SubClass sub=new SubClass(out);
	}
}  

