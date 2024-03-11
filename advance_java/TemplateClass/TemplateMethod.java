class A
{
<T>void show(T x,T y)
{
System.out.println("X="+x);
System.out.println("Y="+y);

}
}
class TemplateMethod
{
public static void main (String ar[])
{
A a1=new A();
a1.show(10,20);
a1.show(10.3,34.4);
a1.show("sita","ram");
}
}