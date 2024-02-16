class Employe 
{
int id;
String name;

Employe (int id,String name)
{
this.id=id;
this.name=name;
}
public boolean equals(Object o)
{
if(id==o.id)
return true;
}
}
class EQUALS_METHOD_5
{
public static void main(String ar[])

{
Employe e1=new Employe(101,"aaa");
Employe e2=new Employe(101,"bbb");
Employe e3=new Employe(101,"aaa");
Employe e4=e1;

System.out.println(e1==e2);
System.out.println(e1==e3);
System.out.println(e1==e4);
System.out.println(e1.equals(e2));
System.out.println(e1.equals(e3));
System.out.println(e1.equals(e4));
}
}

/*
 error: cannot find symbol
if(id==o.id)
        ^
  symbol:   variable id
  location: variable o of type Object
*/
