class B
{
int i;
B(int i)
{
  this.i=i;
}
}
class A
{
int j;
int k;
B b;
A(int j,int k,B b)
{
this.j=j;
this.k=k;
this.b=b;
}
void show()
{
System.out.println("i="+b.i);
System.out.println("j="+j);
System.out.println("k="+k);

}
}
class CloneMethodStep5
{
public static void main(String ar[])
{
	B b1=new B(10);
	A a1=new A(40,20,b1);
	a1.show();
}
}
