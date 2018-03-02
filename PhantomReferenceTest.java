import java.lang.ref.*;
public class PhantomReferenceTest
{
	public static void main(String[] args) throws Exception
	{
		String str=new String("java������");
		ReferenceQueue rq=new ReferenceQueue();
		PhantomReference pr=new PhantomReference(str,rq);
		System.out.println(rq.poll()==pr);
		str=null;
		System.out.println(pr.get());
		System.out.println(rq.poll()==pr);
		System.gc();
		System.runFinalization();
		System.out.println(rq.poll()==pr);
	}
}
