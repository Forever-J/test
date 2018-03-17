import java.util.*;
public class Num2Rmb
{
	private String[] hanArr={"��","Ҽ","��","��","��","��","½","��","��","��"};
	private String[] unitArr={"","ʰ","��","Ǫ","��","��"};
	private String[] monArr={"Ԫ","��","��","��"};
	private static String[] divide(double num)
	{
		// ��һ��������ǿ������ת��Ϊlong�����õ�������������
		long zheng = (long)num;
		// ��������ȥ�������֣��õ�С�����֣�С�����ֳ���100����ȡ���õ�2λС��
		long xiao = Math.round((num - zheng) * 100);
		// ��������2�ַ���������ת��Ϊ�ַ���
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
				result=qToHanStr(numStr2)+"��"+"��"+qToHanStr(numStr1);
			}
			else
			{
				result=qToHanStr(numStr2)+"��"+qToHanStr(numStr1);
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
					result=qToHanStr(numStr3)+"��"+"��"+qToHanStr(numStr2)+"��"+"��"+qToHanStr(numStr1);
				}
				else
				{
					result=qToHanStr(numStr3)+"��"+qToHanStr(numStr2)+"��"+"��"+qToHanStr(numStr1);
				}
			}
			else
			{
				if(numStr2.charAt(0)-48==0)
				{
					result=qToHanStr(numStr3)+"��"+"��"+qToHanStr(numStr2)+"��"+qToHanStr(numStr1);
				}
				else
				{
					result=qToHanStr(numStr3)+"��"+qToHanStr(numStr2)+"��"+qToHanStr(numStr1);
				}
			}
		}
		if(numStr[1].equals("0"))
		{
			result=result+"Ԫ��";
		}
		else
		{
			if(numStr[1].length()==1)
			{
				int b0=numStr[1].charAt(0)-48;
				result=result+"Ԫ"+"��"+hanArr[b0]+"��";
			}
			else
			{
				int b1=numStr[1].charAt(0)-48;
				int b2=numStr[1].charAt(1)-48;
				if(b2==0)
				{
					result=result+"Ԫ"+hanArr[b1]+"��";
				}
				else
				{
					result=result+"Ԫ"+hanArr[b1]+"��"+hanArr[b2]+"��";
				}
			}
		}
		
		return result;
	}
	public static void main(String[] args)
	{
		Num2Rmb nr = new Num2Rmb();
		Scanner sc=new Scanner(System.in);
		System.out.println("�������");
		while(sc.hasNextDouble())
		{
			double rmb=sc.nextDouble();
			System.out.println("����ǣ�"+nr.toHanStr(rmb));
			System.out.println("�������");
		}
	}
}