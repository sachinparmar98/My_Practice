//this example for text and I.W.


class CloneMethodCloneingOfObjectInSameClass implements Cloneable
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
	
    public static void main(String ar[])throws CloneNotSupportedException	{
       CloneMethodCloneingOfObjectInSameClass c1=new CloneMethodCloneingOfObjectInSameClass();
	     c1.get(20,30);
		 CloneMethodCloneingOfObjectInSameClass c2=(CloneMethodCloneingOfObjectInSameClass)c1.clone();
             c2.x=65;		
		c1.show();
		 c2.show();
    }
}