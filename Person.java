public class Person 
{
	private String name;
	private int age;
	public void setName(String name)
	{
		if (name.length()>6||name.length()<2)
		{
			System.out.println("�����õ��������Ϸ���");
			return;
		}
		else 
		{
			this.name=name;
		}
	}
	public String getName()
	{
		return this.name;
	}
	public void setAge(int age)
	{
		if (age<0||age>100)
		{
			System.out.println("�����õ����䲻�Ϸ���");
			return;
		}
		else
		{
			this.age=age;
		}
	}
	public int getAge()
	{
		return this.age;
	}
	public static void main(String[] args) 
	{
		Person p=new Person();
		p.setAge(1000);
	}
}
