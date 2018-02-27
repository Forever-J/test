public class CommandTest1
{
	public static void main(String[] args)
	{
		ProcessArray pa=new ProcessArray();
		int[] array={1,2,3,4};
		pa.process(array,(int[] target)->
			{
				int sum=0;
				for(int tmp:target)
				{
					sum+=tmp;
				}
				System.out.println("数组元素的总和是："+sum);
			}
		);
	}
}
