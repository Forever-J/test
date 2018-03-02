public enum Gender
{
/*	MALE,FEMALE;
	private String name;
	public void setName(String name)
	{
		switch(this)
		{
			case MALE:
				if(name.equals("男"))
				{
					this.name=name;
				}
				else
				{
					System.out.println("参数错误！");
					return;
				}
				break;
			case FEMALE:
				if(name.equals("女"))
				{
					this.name=name;
				}
				else
				{
					System.out.println("参数错误！");
				}
				break;
		}
	}*/
	MALE("男"),FEMALE("女");
	//public static final Gender MALE=new Gender("男");
	//public static final Gender FEMALE=new Gender("女");
	private final String name;
	//枚举类的构造器只能使用private修饰
	private Gender(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}

}