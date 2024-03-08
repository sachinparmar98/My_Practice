//this example for text and I.W.
class A implements Cloneable
{
    int x, y;

    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void show() {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
	public Object clone() throws CloneNotSupportedException
	{
	return super.clone();
	}
}

class CloneMethodCloneObjectOfOneClassInOtherClass {
    public static void main(String ar[])throws CloneNotSupportedException	{
        A a1 = new A();
        a1.get(10, 20);
        A a2=(A)a1.clone();
		a2.x=55;
         a1.show();
        a2.show();
    }
}