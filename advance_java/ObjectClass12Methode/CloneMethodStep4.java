class B
{
int i=10;
}
class A
{
int j=20; 
B b=new B();
}
class CloneMethodStep4
{
public static void main(String ar[])
{
	A a1=new A();
System.out.println("i="+a1.b.i);
System.out.println("j="+a1.j);
}
}
