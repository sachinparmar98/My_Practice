class Employe
{
int id;
String name;
Employe(int id,String name)

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
class EQUALS_METHOD3
{
public static void main(String ar[])
{
Employe e1=new Employe(101,"aaa");
Employe e2=new Employe(102,"bbb");
Employe e3=new Employe(101,"ccc");
Employe e4=e1;
System.out.println(e1==e2);
System.out.println(e1==e3);
System.out.println(e1==e4);
System.out.println(e1.equals(null));
// System.out.println(e1.equals(e3));
// System.out.println(e1.equals(e4));
}
}

/*
false
false
true
Exception in thread "main" java.lang.NullPointerException
        at Employe.equals(EQUALS_METHOD3.java:15)
        at EQUALS_METHOD3.main(EQUALS_METHOD3.java:32)

   note== e.id is point per exception aygi kyoki e ma null ayga or null sa hum id ko acess keraga too 
   exception aygi.

		*/