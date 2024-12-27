                          //   no argument constructor
/* 
                                class A 
{
    A()
    {
        System.out.println("class A no arg constructor");
    }
}
class day32
{
    public static void main (String ar[])
    {
          A a1=new A();
         A a2=new A();
         A a3=new A();
        }
}*/
                                //    constructor overloading
    /* 
                                class A                          
      {
        A(int x,int y)
        {
            System.out.println("sum="+(x+y));
        }
          A(int x,int y,int z)
        {
            System.out.println("sum="+(x+y+z));
        }
      A(int x,int y,int z,int z1)
        {
            System.out.println("sum="+(x+y+z+z1));
        }  
    }
    class day32
    {
        public static void main(String[] args) {
            A a1=new A(10,20);
        A a2=new A(10,20,30);
        A a3=new A(10,20,20,30);
        A a4=new A(10,20);
        }

    }
    */
                                // diffrence between constructor and method 1= no return type 
/* 
class A 
{
    A()
    {
        System.out.println("class A no arg constructor");
    }
    void show ()
    {
        System.out.println("class A method");
    }
}
class day32
{
    public static void main (String ar[])
    {
          A a1=new A();
         a1.show();
         a1.show();
         a1.show();
        }
    }
    */
                                               //diifrence constructor and method 
   /* 
                                               class A 
{
    A()
    {
        System.out.println("class A no arg constructor");
    }
    void show()
    {
        System.out.println("ram");
    }
}
class day32
{
    public static void main (String ar[])
    {
          A a1=new A();
         a1.show();
        }                                        

        */
                        // constructor concept imp
   /*                              class A 
{
   A()
   {
    System.out.println("class A constructor");
   }
   void A()
   {
    System.out.println("class A method");
   }
}
class day32
{
    public static void main (String ar[])
    {
          A a1=new A();
        a1.A();
        }
    }
    */
                    //    STATIC TOPIC 
  /* 
                    class day32
  {
    int x=10;
    public static void main(String[] args) {
        x++;
        System.out.println(x);
    }
  }
  */
  //day33.java:119: error: non-static variable x cannot be referenced from a static context
    
  /*                                           //  STATIC concept
                 class day32
  {
  static  int x=10;
    public static void main(String[] args) {
        x++;
        System.out.println(x);
    }
  }
  */

 /*                                        //concept
                   class day32
  {
    
    public static void main(String[] args) {
     static  int x=10;
        x++;
        System.out.println(x);
    }
  }
  */       
//   day33.java:143: error: illegal start of expression
    //  static  int x=10;                               
                                
 /*                                   //concept static function
class A
{
    void show()
    {
        System.out.println("class A method");
    }
}
class day32
{
    public static void main(String[] args) 
    {
        A.show();
    }
    }
*/
// day33.java:164: error: non-static method show() cannot be referenced from a static context
        // A.show();
 /*                                //   concept static function
class A
  {
    static void show()
    {
        System.out.println("class A static method");
    }
  }                             
   class day32
{
    public static void main(String ar[])
    {
   A.show();   
    }
}
*/