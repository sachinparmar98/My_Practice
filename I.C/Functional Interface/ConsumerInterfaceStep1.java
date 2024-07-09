interface Inter1<T>
{
	void show(T t);
}
class ConsumerInterfaceStep1
{
	public static void main(String ar[])
	{
		Inter1<String >I1=a->System.out.println("my name is =>"+a);
	   I1.show("ram");
	   I1.show("sita");
	}
}