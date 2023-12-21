/*          //static import
import static java.lang.System.*;
class day39
{
    public static void main(String ar[])
    {
        out.println("jai ram");
    }
}
*/
/* 
import static java.lang.System.*;
class day39
{
    public static void main(String ar[])
    {
        int x=Integer.parseInt(ar[0]);
        int y=Integer.parseInt(ar[1]);
        out.println("sum=>"+(x+y));

    }
}
*/ //static import of Integer class 

import static java.lang.System.*;
import static java.lang.Integer.*;

class day39 {
    public static void main(String ar[]) {
        int x = parseInt(ar[0]);
        int y = parseInt(ar[1]);
        out.println("sum=>" + (x + y));

    }
}
