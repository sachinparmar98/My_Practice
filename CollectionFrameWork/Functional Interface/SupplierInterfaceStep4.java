//import java.util.function.Supplier;
//@FunctionalInterface
//interface Inter1<T>
//{
//	void show(T t);
//}
//class SupplierInterfaceStep4
//{
//public static void main(String  ar[])
//{
//	String s[]={"aaa","bbb","ccc","ddd","eee","fff"};
//Inter1<String[]>i=a->
//{
//	for(String s1:a)
//		System.out.println(s1);
//};
//i.show(s);
//}
//}
//


// convert above example in Consumer interface

import java.util.function.Consumer;
class SupplierInterfaceStep4
{
	public static void main(String ar[])
	{
		
		String s1[]={"aaa","vvv","ddd","ssss"};
		Consumer<String[]>i=a->
		{
			for(String s:a)
				System.out.println(s);
		};
		i.accept(s1);
	}
}