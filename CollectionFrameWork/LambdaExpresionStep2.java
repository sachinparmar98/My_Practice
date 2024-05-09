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
			void sum(int x,int y)
			{
				System.out.println(x+y);
			}
		};
	
		i.sum(10,20);
	}
}

/* 

LambdaExpresionStep2.java:13: error: sum(int,int) in <anonymous LambdaExpresionStep1$1> cannot 
implement sum(int,int) in Inter1
                        void sum(int x,int y)
                             ^
  attempting to assign weaker access privileges; was public
1 error



because Inter1 ki sum method public ha or anonymous class ma sum 
metod ko overide kiya ha vo by default default ha
*/