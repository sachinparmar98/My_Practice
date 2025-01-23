// .............EXAMPLE-1............
// class A<T>
// {
// T x,y;
// void get(T a,T b)
// {
// x=a;
// y=b;

// }
// void show()
// {
// System.out.println("x="+x);
// System.out.println("y="+y);
// }
// }
// class TemplateClass
// {
// public static void main (String ar[])
// {
// A a1=new A();
// a1.get(10,20.5);
// a1.get("ram",false);
// a1.show();
// a1.show();
// }
// }

// .............EXAMPLE-2............
// reason for create template method
// class A
// {
// void show(int x,int y)
// {
// System.out.println("X="+x);
// System.out.println("Y="+y);

// }void show(double x,double y)
// {
// System.out.println("X="+x);
// System.out.println("Y="+y);

// }
// }
// class TemplateClass
// {
// public static void main (String ar[])
// {
// A a1=new A();
// a1.show(10,20);
// a1.show(10.3,34.4);
// a1.show("sita","ram");
// //9424012252 rampresad mangal
// }
// }

// .............EXAMPLE-3.................
// class A
// {
// <T>void show(T x,T y)
// {
// System.out.println("X="+x);
// System.out.println("Y="+y);

// }
// }
// class TemplateClass
// {
// public static void main (String ar[])
// {
// A a1=new A();
// a1.show(10,20);
// a1.show(10.3,34.4);
// a1.show("sita","ram");
// }
// }
// .............EXAMPLE-4.................
// Get class name using variable name

// class A<T>
// {
// T x,y;
// void get(T a,T b)
// {

// System.out.println(a.getClass().getName());
// System.out.println(b.getClass().getName());
// }
// }
// class TemplateClass
// {
// public static void main (String ar[])
// {
// A a1=new A();
// a1.get(10,20.5);
// a1.get("ram",false);
// a1.get('s',1);

// }
// }