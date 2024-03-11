import java.lang.reflect.*;
class  DisplayClassAllMethodType2

{
public static void main(String ar[])throws ClassNotFoundException
{
Class c=Class.forName("java.lang.String");
Method m[]=c.getDeclaredMethods();
for(Method m1:m)
{

System.out.println(m1);
}

}
}