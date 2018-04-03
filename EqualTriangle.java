import java.util.*;
public class EqualTriangle 
{
	public void equal(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÊý×Ö£º");
		new EqualTriangle().equal(sc.nextInt());
	}
}
