import java.util.regex.*;
public class MatchesTest
{
	public static void main(String[] args)
	{
		String[] mails=
		{
			"15989@we.com",
			"sdf96@java.com",
			"waa.org","as4a@xxx.cn","aswddf55545@cc.kk","jj@asqq.net"
		};
		Pattern mp=Pattern.compile("\\w{3,20}@\\w+.(com|cn|org|net|gov)");
		Matcher ma=null;
		for(String mail:mails)
		{
			if(ma==null)
			{
				ma=mp.matcher(mail);
			}
			else
			{
				ma=ma.reset(mail);
			}
			String result=mail+(ma.matches()?"��":"����")+"һ����Ч���ʼ���ַ!";
			System.out.println(result);
		}
	}
}