import java.util.function.Supplier;
class SupplierInterfaceStep2
{
	public static void main(String ar[])
	{
		Supplier<String >S1=()->"ram singh ji";
		System.out.println("my name is =>"+S1.get());
	   
	}
}