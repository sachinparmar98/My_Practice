//Deep cloning means user defind cloneing
class B
{
int i;
B(int i)
{
this.i=i;
}
}
class A implements Cloneable
{

 int j,k;
 B b;
 A(int j,int k,B b)
 {
 
    this.j=j;
	this.k=k;
	this.b=b;
 }
 
 void show()
 {
System.out.println(b.i);
System.out.println(j);
System.out.println(k);
 }
 
 public Object clone()throws CloneNotSupportedException
 {
   B b2=new B(b.i);
   A a5=new A(j,k,b2);
   return a5;
 }
}
class cloneMethodDeepCloningConcept2
{
public static void main(String ar[])throws CloneNotSupportedException
{
   B b1=new B(10);
   A a1=new A(20,30,b1);
   A a2=(A)a1.clone();
   a1.show();
   System.out.println(".................");
    a2.show();
   System.out.println(".................");
    
	a2.b.i=555;
	a2.j=666;
	a1.show();
   System.out.println(".................");
	a2.show();
   System.out.println(".................");

 A a3=(A)a1.clone();
  a3.b.i=777;
	a3.j=888;
	a1.show();
	 System.out.println(".................");
	a2.show();
   System.out.println(".................");
	a3.show();
   System.out.println(".................");
}
}