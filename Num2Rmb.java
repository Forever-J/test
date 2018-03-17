import java.util.*;
public class Num2Rmb
{
	private String[] hanArr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	private String[] unitArr={"","拾","佰","仟","万","亿"};
	private String[] monArr={"元","角","分","整"};
	private static String[] divide(double num)
	{
		// 将一个浮点数强制类型转换为long，即得到它的整数部分
		long zheng = (long)num;
		// 浮点数减去整数部分，得到小数部分，小数部分乘以100后再取整得到2位小数
		long xiao = Math.round((num - zheng) * 100);
		// 下面用了2种方法把整数转换为字符串
		return new String[]{zheng + "", String.valueOf(xiao)};
	}
	private String qToHanStr(String numStr)
	{
		//String[] numStr=divide(rmb);
		if(numStr.length()<4)
		{
			int i=4-numStr.length();
			for(int j=0;j<i;j++)
			{
				numStr="0"+numStr;
			}
		}
		String result="";
		//int numLen=numStr[1].length();
		int a1=numStr.charAt(0) - 48;
		int a2=numStr.charAt(1) - 48;
		int a3=numStr.charAt(2) - 48;
		int a4=numStr.charAt(3) - 48;
		if(a1==0)
		{
			if(a2==0)
			{
				if(a3==0)
				{
					result += hanArr[a4];
				}
				else
				{
					result += hanArr[a3] + unitArr[1];
					if(a4==0)
					{}
					else
					{result += hanArr[a4] ;}
				}
			}
			else
			{
				result += hanArr[a2] + unitArr[2];
			    if(a3==0)
				{
					if(a4==0)
					{}
					else
					{
						result += hanArr[a3];
						result += hanArr[a4];
					}
				}
				else
				{
					result += hanArr[a3] + unitArr[1];
					if(a4==0)
					{}
					else
					{result += hanArr[a4] ;}
				}
			}
		}
		else
		{
			result += hanArr[a1] + unitArr[3];
			if(a2==0)
			{
				if(a3==0)
				{
					if(a4==0)
					{

					}
					else
					{
						result += hanArr[a2];
						result += hanArr[a4];
					}
				}
				else
				{
					result += hanArr[a2];
					result += hanArr[a3] + unitArr[1];
					if(a4==0)
					{}
					else
					{result += hanArr[a4] ;}
				}
			}
			else
			{
				result += hanArr[a2] + unitArr[2];
				if(a3==0)
				{
					if(a4==0)
					{}
					else
					{
						result += hanArr[a3];
						result += hanArr[a4];
					}
				}
				else
				{
					result += hanArr[a3] + unitArr[1];
					if(a4==0)
					{}
					else
					{result += hanArr[a4] ;}
				}
			}
		}
		return result;
	}
	public String toHanStr(double rmb)
	{
		String result="";
		String[] numStr=divide(rmb);
		int l=numStr[0].length();
		if(l<=4)
		{
			result=qToHanStr(numStr[0]);
		}
		if(l>4&&l<=8)
		{
			String numStr1=numStr[0].substring(l-4);
			String numStr2=numStr[0].substring(0,l-4);
			if(numStr1.charAt(0)-48==0)
			{
				result=qToHanStr(numStr2)+"万"+"零"+qToHanStr(numStr1);
			}
			else
			{
				result=qToHanStr(numStr2)+"万"+qToHanStr(numStr1);
			}
		}
		if(l>8&&l<=12)
		{
			String numStr1=numStr[0].substring(l-4);
			String numStr2=numStr[0].substring(l-8,l-4);
			String numStr3=numStr[0].substring(0,l-8);
			if(numStr1.charAt(0)-48==0)
			{
				if(numStr2.charAt(0)-48==0)
				{
					result=qToHanStr(numStr3)+"亿"+"零"+qToHanStr(numStr2)+"万"+"零"+qToHanStr(numStr1);
				}
				else
				{
					result=qToHanStr(numStr3)+"亿"+qToHanStr(numStr2)+"万"+"零"+qToHanStr(numStr1);
				}
			}
			else
			{
				if(numStr2.charAt(0)-48==0)
				{
					result=qToHanStr(numStr3)+"亿"+"零"+qToHanStr(numStr2)+"万"+qToHanStr(numStr1);
				}
				else
				{
					result=qToHanStr(numStr3)+"亿"+qToHanStr(numStr2)+"万"+qToHanStr(numStr1);
				}
			}
		}
		if(numStr[1].equals("0"))
		{
			result=result+"元整";
		}
		else
		{
			if(numStr[1].length()==1)
			{
				int b0=numStr[1].charAt(0)-48;
				result=result+"元"+"零"+hanArr[b0]+"分";
			}
			else
			{
				int b1=numStr[1].charAt(0)-48;
				int b2=numStr[1].charAt(1)-48;
				if(b2==0)
				{
					result=result+"元"+hanArr[b1]+"角";
				}
				else
				{
					result=result+"元"+hanArr[b1]+"角"+hanArr[b2]+"分";
				}
			}
		}
		
		return result;
	}
	public static void main(String[] args)
	{
		Num2Rmb nr = new Num2Rmb();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入金额：");
		while(sc.hasNextDouble())
		{
			double rmb=sc.nextDouble();
			System.out.println("结果是："+nr.toHanStr(rmb));
			System.out.println("请输入金额：");
		}
	}
}