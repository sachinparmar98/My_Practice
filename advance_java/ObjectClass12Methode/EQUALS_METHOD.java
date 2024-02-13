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
class EQUALS_METHOD
{
public static void main(String ar[])
{
Employe e1=new Employe(101,"aaa");
Employe e2=new Employe(102,"bbb");
Employe e3=new Employe(101,"aaa");
Employe e4=e1;
System.out.println(e1.equals(e2));
}
}

//out put= true  