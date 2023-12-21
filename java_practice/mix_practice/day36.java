/*                            // main method
class  day36
{
    public static void main (String ar[])
    {

    }
    
}
*/  
/*                           // Sttic can not acess non static data
class A
{
    int x=10;
    static
    {
        System.out.println("x="+x);
    }
}
class  day36
{
    public static void main (String ar[])
    {
        A a1=new A();

    }
    
}
*/
 /*                         // error non-static method cube(int) cannot be referenced from a static context
class A
{
    static  int x=10;
    static
    {
        System.out.println("x="+(cube(x)));
    }
    int cube(int x)
    {
        return x*x*x;
    }
}
class  day36
{
    public static void main (String ar[])
    {
        A a1=new A();

    }
    
}
*/
/*                         // op x=1000
class A
{
    static  int x=10;
    static
    {
        System.out.println("x="+(cube(x)));
    }
   static int cube(int x)
    {
        return x*x*x;
    }
}
class  day36
{
    public static void main (String ar[])
    {
        A a1=new A();

    }
    
}
*/
 /*                       //non static can acess staic data
class A
{
static  void show2()
    {
        System.out.println("show 2 method");
    }
   void show()
   {
    System.out.println("show method");
  show2();
   }
    
}
class  day36
{
    public static void main (String ar[])
    {
        A a1=new A();
        a1.show();

    }
    
}
*/
 /*                      //non static means instance data
class A
{
     void show2()
    {
        System.out.println("show 2 method");
    }
   void show()
   {
    System.out.println("show method");
  show2();
   }
    
}
class  day36
{
    public static void main (String ar[])
    {
        A a1=new A();
        a1.show();

    }
    
}

*/
 /*                     // static cannot acess instance data
class A
{
     void show2()
    {
        System.out.println("show 2 method");
    }
 static void show()
   {
    System.out.println("show method");
  show2();
   }
    
}
class  day36
{
    public static void main (String ar[])
    {
        A a1=new A();
        a1.show();

    }
    
}
*/
 /*                    // local varible inside static method =10
class A
{
 static void show()
   {
    int x=10;
    System.out.println("x="+x);
  
   }
    
}
class  day36
{
    public static void main (String ar[])
    {
        A.show();

    }
    
}
*/
  /*                  // static variable inside static method        error: illegal start of expression
class A
{
 static void show()
   {
  static   int x=10;
    System.out.println("x="+x);
  
   }
    
}
class  day36
{
    public static void main (String ar[])
    {
        A.show();

    }
    
}
*/
 /*                  // static variable inside non static(instance) method        error: illegal start of expression
class A
{
  void show()
   {
  static   int x=10;
    System.out.println("x="+x);
  
   }
    
}
class  day36
{
    public static void main (String ar[])
    {
        A.show();

    }
    
}
*/
           



