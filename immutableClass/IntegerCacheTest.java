public class IntegerCacheTest
{
	public static void main(String[] args)
	{
		// �����µ�Integer����
		Integer in1 = new Integer(6);
		// �����µ�Integer���󣬲�����ö���
		Integer in2 = Integer.valueOf(6);
		// ֱ�Ӵӻ�����ȡ��Ineger����
		Integer in3 = Integer.valueOf(6);
		System.out.println(in1 == in2); // ���false
		System.out.println(in2 == in3); // ���true
		// ����Integerֻ����-128~127֮���ֵ��
		// ���200��Ӧ��Integer����û�б����档
		Integer in4 = Integer.valueOf(200);
		Integer in5 = Integer.valueOf(200);
		System.out.println(in4 == in5); //���false
	}
}