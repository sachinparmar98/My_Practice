/*                           //multiple instance block and static block

class A
{

  {
      System.out.println("instance 1");
  }
  
 
  {
      System.out.println("instance 1");
  }
  
 
 
  static 
  {
      System.out.println("staic block");
  }
  
  static 
  {
      System.out.println("staic block");
  }
  static void show()
  {
      System.out.println("method");
  }
  
}

class day35
{
  public static void main(String ar[])
  {
      // A a1=new A();
      // A a2=new A();
      
  }
}
*/

/*                               //instance block parmeterized and non argument constructor
class A
{
    {
        System.out.println("instance block");
    }  
    A()
  {
    System.out.println("constructor");
  }
  A(int x)
  {
    System.out.println("parmeterized constructor");
}
}
class day35
{
    public static void main(String[] args) {
        A a1=new A(10);
    }
}
*/
/*                                    //  constructor not working 
class A
{
    A()
    {
        System.out.println("class A constructor");
    }
    A()
    {
        System.out.println("class A constructor");
    }
    A()
    {
        System.out.println("class A constructor");
    }
    A()
    {
        System.out.println("class A constructor");
    }
    A()
    {
        System.out.println("class A constructor");
    }
}
class day35
{
    public static void main(String[] args) {
        A a1=new A();
    }
}
*/
/*                                    //instance block in main class 

class day35 {
    {
        System.out.println("intstace block");
    }
    public static void main(String[] args) {
        System.out.println("main method");
    }   
}
*/
/*                                         //instance block and static method
class A {
 {
     System.out.println("instance block");
 }

 static void show() {
     System.out.println("show method");
 }

}

class day35 {
 public static void main(String[] args) {
     A.show();
 }
}
*/
/*                                      //instance block and  method

               
class A {
   {
       System.out.println("instance block");
   }

   void show()
    {
       System.out.println("method");
   }

}

class day35 
{
   public static void main(String[] args) {
       A a1 = new A();
       a1.show();
   }
}
*/
/*                                         //static block and main method

class day35
{
static
    {
    System.out.println("class prac");
}
public static void main(String[] args)
 {
    System.out.println("main method");

}

}
*/
/*                                         //multiple static  block 
{
    static 
    {
        System.out.println("staic block-1");
    }
    public static void main(String[] args) {
        System.out.println("main method ");

    }
    static 
    {
        System.out.println("static block-2");
    }
}
*/
 /*                                           //we can not create static block in main method
class day35 {
    static {
        System.out.println("staic block-1");
    }

    public static void main(String[] args)
     {
        System.out.println("main method ");
        static  {
            System.out.println("inside main static block");
       }

 }

    static {
        System.out.println("static block-2");
    }
}
*/
  /*                                          //static block,istance block ,main method ,method
class A
{
    static{
        System.out.println("class A static block");
    }
     void show()
     {
        System.out.println("class A show method");
     }
}
class day35
{
    static
    {
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        A a1=new A();
        a1.show();
    }
}
*/
 /*                                             //combo example 

class A
{
{
    System.out.println("instance block");
}
static 
{
    System.out.println("class A static block");
}
A()
{
    System.out.println("class A constructor");
}
A(int x)
{
    System.out.println("class A parm constructor");
}
void show()
{
    System.out.println("class A show method");
}

}
class day35
{
    public static void main(String[] args) {
        System.out.println("main method");
        A a1=new A();
        A a2=new A(10);
        a1.show();
        a2.show();
    }
}
*/