@FunctionalInterface
interface Inter1
{
void sum(int x,int y);

}
class LambdaExpresionStep1
{
	public static void main(String ar[])
	{
		Inter1 i=new Inter1()
		{
			
		};
	
		
	}
}

/* 
{
};  this is the annonymous class 


LambdaExpresionStep1.java:12: error: <anonymous LambdaExpresionStep1$1> is not abstract and does not override abstract method sum(int,int) in Inter1
                {
                ^
1 error

*/