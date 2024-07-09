import java.util.function.Consumer;
class MethodReffrenceStep8
{
	public static void main(String ar[])
	{
		Consumer c=System.out::println;
		c.accept(10);
	}
}

/*
D:\sachin\GitDemo\My_Practice\CollectionFrameWork\MethodReffrence>javac MethodReffrenceStep8.java
Note: MethodReffrenceStep8.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\sachin\GitDemo\My_Practice\CollectionFrameWork\MethodReffrence>java MethodReffrenceStep8
10
*/