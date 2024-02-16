class Employe
{
int id;
String name;
Employe(int id,String name)
{
this.id=id;
this.name=name;
}
public String toString()
{

return getClass().getName()+"@"+Integer.toHexString(hashCode());
}

}
class toS_12
{
public static void main (String ar[])
{
Employe e1=new Employe(101,"aaa");
System.out.println(e1);

}
}

/* output ==
Employe@7852e922

note== \\Object class ki toString method internally below type likhi has

public String toString()
{

return getClass().getName()+"@"+Integer.toHexString(hashCode());
}


*/