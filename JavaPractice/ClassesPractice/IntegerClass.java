//.........................EXAMPLE-1................
// class IntegerClass
// {
// public static void main (String ar[])
// {
// Integer x=50;
// Integer y=50;

// Integer a=500;
// Integer b=500;

// Integer p=100;
// Integer q=100;

// Integer r=1000;
// Integer s=1000;

// System.out.println(x==y);
// System.out.println(a==b);
// System.out.println(p==q);
// System.out.println(r==s);

// }
// }

// /*out put
// true
// false
// true
// false


// <<<<<<< HEAD
// =======
// In Java, there is a concept known as the Integer Constant Pool, but it's more commonly associated with the caching mechanism for small integers.

// Java maintains a pool of Integer objects for values in the range of -128 to 127 (inclusive). When you create an Integer object with a value in this range, Java first checks if an object with the same value already exists in the pool. If it does, it returns a reference to that existing object rather than creating a new one. This is done to save memory and improve performance.

// Here's an example:

// ```java
// Integer num1 = 42;
// Integer num2 = 42;

// System.out.println(num1 == num2); // This will print true because both refer to the same Integer object in the pool.
// ```

// However, for values outside the range -128 to 127, new Integer objects are created, and the reference comparison (`==`) will not work as expected:

// ```java
// Integer num3 = 150;
// Integer num4 = 150;

// System.out.println(num3 == num4); // This will print false because new objects are created for values outside the pool range.
// ```

// So, while there is a form of a constant pool for small integers in Java, it's important to be aware of its limitations and behavior.

// is out put ka reasion late out put ma milaga
// >>>>>>> caffbcf7b99983565a9c6841e6894de4a9cb0878
// */


//..............EXAMPLE-2..................
//Integer constant pool for small value concept
// public class IntegerClass{
// 	public static void main(String[] args) {
		
// 		Integer a=new Integer(100);
// 		Integer b=new Integer(100);
		
// 		Integer x=100;
// 		Integer y=100;
		
// 		System.out.println(x==y);//true
		
// 		System.out.println(a==b);//false
		
// 	}
// }
/*

1. Beacuse hamna a or b ko 
existing implementation techniques ka  use ker ka create kiya ha too dono ka reference different raha ga

2. X or y ko literal ka use kerka create kiya too reffrence same raha ga is liya true aya only for - 128 to 127 range it's applicable out of this range output same as 1. 

*/
