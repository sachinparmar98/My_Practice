
class A<T>
{
T x,y;
void get(T a,T b)
{

System.out.println(a.getClass().getName());
System.out.println(b.getClass().getName());
}
}
class GetClassNameUsingVaribleName
{
public static void main (String ar[])
{
 A a1=new A();
 a1.get(10,20.5);
 a1.get("ram",false);
 a1.get('s',1);
 
}
}