import java.util.function.Consumer;
class ConsumerInterfaceStep2
{
	public static void main(String ar[])
	{
		Consumer<String >C1=a->System.out.println("my name is =>"+a);
	   C1.accept("ram");
	   C1.accept("sita ji");
	}
}