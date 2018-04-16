class Name
{
	private String firstName;
    private String lastName;
	public Name(){}
	public Name(String firstName , String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
}
public class Person
{
	private final Name name;
	public Person(Name name)
	{
		this.name=new Name(name.getFirstName(),name.getLastName());
	}
	public Name getName()
	{
		return new Name(name.getFirstName(),name.getLastName());
	}
	
	public static void main(String[] args)
	{
		Name n = new Name("���", "��");
		Person p = new Person(n);
		// Person�����name��firstNameֵΪ"���"
		System.out.println(p.getName().getFirstName());
		// �ı�Person����name��firstNameֵ
		n.setFirstName("�˽�");
		// Person�����name��firstNameֵ���ᱻ��Ϊ"�˽�"
		System.out.println(p.getName().getFirstName());
		p.name.setFirstName("�˽�");
		System.out.println(p.getName().getFirstName());
	}
}  
