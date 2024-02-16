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
	Employe e=(Employe)o;
if(id==e.id && name.equals(e.name))
return true;
else 
	return false;
}
}
class EQUALS_METHOD_8
{
public static void main(String ar[])

{
Employe e1=new Employe(101,"aaa");
Employe e2=new Employe(102,"bbb");
Employe e3=new Employe(101,"ccc");
Employe e4=e1;

System.out.println(e1.equals("aaa"));

}
}

/*
 Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to Employe
        at Employe.equals(EQUALS_METHOD_8.java:13)
        at EQUALS_METHOD_8.main(EQUALS_METHOD_8.java:30)

*/
