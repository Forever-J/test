public enum Gender
{
/*	MALE,FEMALE;
	private String name;
	public void setName(String name)
	{
		switch(this)
		{
			case MALE:
				if(name.equals("��"))
				{
					this.name=name;
				}
				else
				{
					System.out.println("��������");
					return;
				}
				break;
			case FEMALE:
				if(name.equals("Ů"))
				{
					this.name=name;
				}
				else
				{
					System.out.println("��������");
				}
				break;
		}
	}*/
	MALE("��"),FEMALE("Ů");
	//public static final Gender MALE=new Gender("��");
	//public static final Gender FEMALE=new Gender("Ů");
	private final String name;
	//ö����Ĺ�����ֻ��ʹ��private����
	private Gender(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}

}