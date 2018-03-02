public enum Gender implements GenderDesc
{
	MALE("男")
	{
		public void info()
		{
			System.out.println("这个枚举值代表男性");
		}
	},
	FEMALE("女")
	{
		public void info()
		{
			System.out.println("这个枚举值代表女性");
		}
	};
	private final String name;
	// 枚举类的构造器只能使用private修饰
	private Gender(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	// 增加下面的info()方法，实现GenderDesc接口必须实现的方法
	public void info()
	{
		System.out.println(
			"这是一个用于用于定义性别的枚举类");
	}
}