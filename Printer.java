
import j.Output;
interface Product 
{
	int getProduceTime();
}
public class Printer implements Output,Product
{
	private String[] printData=new String[MAX_CACHE_LINE];
	private int dataNum=0;
	public void out()
	{
		while(dataNum>0)
		{
			System.out.println("��ӡ����ӡ��"+printData[0]);
			System.arraycopy(printData,1,printData,0,--dataNum);
		}

	}
	public void getData(String msg)
	{
		if(dataNum>=MAX_CACHE_LINE)
		{
			System.out.println("����������������ʧ�ܣ�");
		}
		else
		{
			printData[dataNum++]=msg;
		}
	}
	public int getProduceTime()
	{
		return 0;
	}
	public static void main(String[] args)
	{
		// ����һ��Printer���󣬵���Outputʹ��
		Output o = new Printer();
		o.getData("������Java EE��ҵӦ��ʵս");
		o.getData("���Java����");
		o.out();
		o.getData("���Android����");
		o.getData("���Ajax����");
		o.getData("���Java����");
		o.out();
		// ����Output�ӿ��ж����Ĭ�Ϸ���
		o.print("�����" , "��˽�" , "�׹Ǿ�");
		o.test();
		// ����һ��Printer���󣬵���Productʹ��
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		// ���нӿ����͵����ñ�������ֱ�Ӹ���Object���͵ı���
		Object obj = p;
	}
}