class A
{
void show(int x,int y)
{
System.out.println("X="+x);
System.out.println("Y="+y);

}void show(double x,double y)
{
System.out.println("X="+x);
System.out.println("Y="+y);

}
}
class ReasonForCreateTemplateMethod
{
public static void main (String ar[])
{
A a1=new A();
a1.show(10,20);
a1.show(10.3,34.4);
a1.show("sita","ram");
//9424012252 rampresad mangal
}
}