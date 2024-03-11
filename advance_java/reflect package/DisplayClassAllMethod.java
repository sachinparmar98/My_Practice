import java.lang.reflect.*;
class  DisplayClassAllMethod

{
public static void main(String ar[])
{
Object o=new Object();
Class c=o.getClass();
Method m[]=c.getDeclaredMethods();
for(Method m1:m)
{

System.out.println(m1);
}

}
}