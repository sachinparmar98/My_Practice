interface Inter1<R>

{
	R get();
	
}
class SupplierInterfaceStep1
{
	public static void main(String ar[])
	{
		Inter1<String >I1=()->"Sachin Singh parmar";
		System.out.println("my name is =>"+I1.get());
	   
	}
}