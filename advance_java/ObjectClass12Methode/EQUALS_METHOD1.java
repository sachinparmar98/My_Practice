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
class EQUALS_METHOD1
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
System.out.println(e1.equals("aaa"));
System.out.println(e1.equals(e3));
System.out.println(e1.equals(e4));
}
}

/*false
false
true
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to Employe
        at Employe.equals(EQUALS_METHOD1.java:14)
        at EQUALS_METHOD1.main(EQUALS_METHOD1.java:32)
		
		note= because employe class ka refrence varible e String class ka object hold nhi kera
sakta ha		
		
		*/