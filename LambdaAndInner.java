@FunctionalInterface
interface Displayable
{
	void display();
	default int add(int a,int b)
	{
		return a+b;
	}
}
public class LambdaAndInner
{
	private int age=12;
	private static String name="Joey";
	public void test()
	{
		String book="Mike";
		Displayable dis=()->{
		System.out.println("book:"+book);
		System.out.println("age:"+age);
		System.out.println("name:"+name);
		};
		dis.display();
		System.out.println(dis.add(3,5));
	}
	public static void main(String[] args)
	{
		LambdaAndInner lambda=new LambdaAndInner();
		lambda.test();
	}
}