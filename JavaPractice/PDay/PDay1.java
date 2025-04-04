/*
 * class A {
 * int id;
 * String name;
 * 
 * A(int id, String name) {
 * this.id = id;
 * this.name = name;
 * }
 * 
 * public int hashCode() {
 * // return super.hashCode();
 * return id;
 * }
 * 
 * public String toString() {
 * // return getClass().getName() + "@" + Integer.toHexString(hashCode()) ;
 * return "id=" + id + "\tname=" + name;
 * }
 * 
 * public boolean equals(Object o) {
 * if (this == o)
 * return true;
 * if (o instanceof A) {
 * A a = (A) o;
 * if (id == a.id && name.equals(a.name))
 * return true;
 * }
 * return false;
 * 
 * }
 * 
 * }
 * 
 * class PDay1 {
 * public static void main(String ar[]) {
 * A a1 = new A(10, "Ram");
 * A a2 = new A(11, "sita");
 * A a3 = new A(12, "gita");
 * A a4 = new A(13, "mohan");
 * A a5 = a1;
 * // System.out.println(a1);
 * // System.out.println(a2);
 * // System.out.println(a3);
 * // System.out.println(a4);
 * // System.out.println(a1.hashCode());
 * // System.out.println(a2.hashCode());
 * // System.out.println(a3.hashCode());
 * // System.out.println(a4.hashCode());
 * System.out.println(a1.equals(a2));
 * System.out.println(a1.equals(a3));
 * System.out.println(a3.equals(a4));
 * System.out.println((a5.equals(a1)));
 * 
 * }
 * }
 */

/*
 * class A {
 * }
 * 
 * class B extends A {
 * }
 * 
 * class C extends A {
 * }
 * 
 * class PDay1 {
 * public static void main(String ar[]) {
 * 
 * // B b = new B();
 * // C c = new C();
 * // System.out.println(b == c);//error: incomparable types: B and C
 * /*
 * A a = new A();
 * A a1 = new B();
 * A a2 = new C();
 * System.out.println(a instanceof A);
 * System.out.println(a1 instanceof A);
 * System.out.println(a2 instanceof A);
 * System.out.println("............................");
 * System.out.println(a instanceof A);
 * System.out.println(a1 instanceof B);
 * System.out.println(a2 instanceof C);
 */
/*
 * B b = new B();
 * System.out.println("............................");
 * System.out.println(b instanceof A);
 * System.out.println(b instanceof B);
 * System.out.println(b instanceof C);
 */
// C b = new C();
// System.out.println("............................");
// System.out.println(b instanceof A);
// System.out.println(b instanceof B);
// System.out.println(b instanceof C);
// }

// }
/* 
class A implements Cloneable {
    int x;

    public A(int x) {
        this.x = x;

    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class PDay1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(10);
        A a2 = (A) a.clone();
        System.out.println(a.x);
        System.out.println(a2.x);
        a.x = 40;
        System.out.println(a.x);
        System.out.println(a2.x);

    }
}
    */

/* 
class B {
int x;

B(int x) {
    this.x = x;
}
}

class A implements Cloneable {
B b;
int id;
int salery;

public A(B b, int id, int salery) {
    this.b = b;
    this.id = id;
    this.salery = salery;

}

public void show() {
    System.out.println(b.x);
    System.out.println(id);
    System.out.println(salery);
}

public Object clone() throws CloneNotSupportedException {
    return super.clone();
}
}

class PDay1 {
public static void main(String[] args) throws CloneNotSupportedException {
    B b = new B(10);
    A a = new A(b, 101, 20000);
    A a2 = (A) a.clone();
    a.show();
    a2.show();
    System.out.println(".......................");
    a2.b.x = 20;// if we chage in a2 ka b ka x ma too iska effect a ka corresponding bhi show
                // hoga there for this is shallow cloning example
    a.show();
    a2.show();
}
}*/
/* 
class B {
    int x;

    B(int x) {
        this.x = x;
    }
}

class A {
    B b;
    int id;
    int salery;

    A(B b, int id, int salery) {
        this.b = b;
        this.id = id;
        this.salery = salery;

    }

    public void show() {
        System.out.println(b.x);
        System.out.println(id);
        System.out.println(salery);

    }

    public A deepClone() {
        B b1 = new B(b.x);
        return new A(b1, id, salery);

    }
}

class PDay1 {
    public static void main(String[] args) {
        B b = new B(5);
        A a = new A(b, 101, 3000);
        A a2 = a.deepClone();
        a.show();
        a2.show();
        System.out.println(".........................");
        a2.b.x = 50;
        a.show();
        a2.show();

    }
}
    */
/* 
class A {
    static int countFinalizeCall = 0;

    public void finalize() {
        System.out.println("finalize method call..........." + ++countFinalizeCall);
    }
}

class PDay1 {
    public static void main(String[] args) {
        A a[] = new A[100000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = new A();
            a[i] = null;
            System.gc();
            // Runtime.getRuntime().gc();
        }
        System.out.println("ram");
    }
}
 */

 /* 
import java.lang.reflect.*;

class A {
    public void show1() {
    }

    public void show2() {
    }

    public void show3() {
    }

    public void show4() {
    }
}

class PDay1 {
    public static void main(String[] args) {
         // Object o=new Object();
           A a=new A();
         Class c = a.getClass();
        Method m[] = c.getDeclaredMethods();
        for (Method m1 : m) {
            System.out.println(m1);
        }

    }
}
    */


import java.sql.*;
class PDay1
    {
        public static void main(String[] args) {
            String s1="ram";
            String s2="123";
            try
            {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql:///PDay", "root", "root");
                Statement st=con.createStatement();
               String s=" insert into regis values('"+s1+"','"+s2+"')";
              st. executeUpdate(s);
               System.out.println("data inserted");

               con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
/*
 * public boolean equals(Object);
 * public int hashCode();
 * public String toString();
 * protected Object clone();
 * protected void finalize();
 * public final Class getClass();
 * public final void wait();
 * public final void wait(long );
 * public final void wait(long ,int);
 * public final notify();
 * public finak notifyAll();
 * private void registerNatives();
 */