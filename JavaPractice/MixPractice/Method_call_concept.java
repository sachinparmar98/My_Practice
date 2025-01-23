class A
{
	
	void show1()
	{
		show2();
		System.out.println("class A show1 method");
	}
	void show2()
	{
		System.out.println("class A show2 method");
	}
}
class B extends A
{
	
	void show2()
	{
		System.out.println("class B show2 method");
	}
}
class Method_call_concept
{
public static void main (String ar[])
{
B b1=new B();
b1.show1();

}
}

/*out put
class B show2 method
class A show1 method


note==> hamne method ko class  B ka object sa call ki ha show1 method ka class B ma nhi milna per 
super class A ki call ho jai gi lekin show2 method class B ma to class B ki hi call ho gi 
 
*/