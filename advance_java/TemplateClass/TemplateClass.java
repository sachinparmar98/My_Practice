class A<T>
{
T x,y;
void get(T a,T b)
{
x=a;
y=b;
}
void show()
{
System.out.println("x="+x);
System.out.println("y="+y);
}
}
class TemplateClass
{
public static void main (String ar[])
{
 A a1=new A();
 a1.get(10,20.5);
 a1.get("ram",false);
 a1.show();
 a1.show();
}
}