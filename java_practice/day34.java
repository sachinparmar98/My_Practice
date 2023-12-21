 /*                           //normal variable
class A
{
    int x=10;
 void show()
 {
    x++;
    System.out.println(x);
 }
}
class day34
{
    public static void main (String ar[])
{
    A a1=new A();
    A a2=new A();
    A a3=new A();
       a1.show();
       a2.show();
       a3.show();
       a1.show();
       a2.show();
       a1.show();
       a3.show();
       a1.show();
}}
*/
/*                                // static vriable
     class A               
       {
          static  int x=10;

   void show()
 {
    x++;
    System.out.println(x);
 }

}
class day34
{
    public static void main (String ar[])
{
    A a1=new A();
    A a2=new A();
    A a3=new A();
       a1.show();
       a2.show();
       a3.show();
       a1.show();
       a2.show();
       a1.show();
       a3.show();
       a1.show();
}}

*/
   /*                                            //instance variable another name is object variabl
    class A
    {
        int x=10;
    }
    class day34
    {
        public static void main(String[] args) {
            A a1=new A();
            System.out.println(a1.x);
        }
    }
    */

/*                                                //static varible another name is  class
class A
{
    static int x=10;
}
class day34
{
    public static void main(String[] args) 
    {
        System.out.println(A.x);    
    }
}
*/
 /*                                    //   without  instance block
class A 
{
    System.out.println("hi sachin");
}
class day34
{
    public static void main(String[] args) {
        A a1=new A();

    }
}
*/
 /*                                       //  instance block
class A 
{
    {
    System.out.println("hi sachin");
}}
class day34
{
    public static void main(String[] args) {
        A a1=new A();

    }
}
 
*/


                                    //   constructor and instance block
    class A
    {
        A()
        {
            System.out.println("constructor");
        }
        {
            System.out.println("instance block");
        }
    }
    class day34
    {
        public static void main(String[] args) {
            A a1=new A();
            
        }
    }