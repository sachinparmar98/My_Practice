//.........................STEP-1.................

// @FunctionalInterface
// interface Inter1
// {
// void sum(int x,int y);

// }
// class LambdaExpresion
// {
// 	public static void main(String ar[])
// 	{
// 		Inter1 i=new Inter1()
// 		{
			
// 		};
	
		
// 	}
// }

// /* 
// {
// };  this is the annonymous class 


// LambdaExpresionStep1.java:12: error: <anonymous LambdaExpresionStep1$1> is not abstract and does not override abstract method sum(int,int) in Inter1
//                 {
//                 ^
// 1 error

// */

//.........................STEP-2.................

@FunctionalInterface
// interface Inter1
// {
// void sum(int x,int y);

// }
// class LambdaExpresion
// {
// 	public static void main(String ar[])
// 	{
// 		Inter1 i=new Inter1()
// 		{
// 			void sum(int x,int y)
// 			{
// 				System.out.println(x+y);
// 			}
// 		};
	
// 		i.sum(10,20);
// 	}
// }

// /* 

// LambdaExpresionStep2.java:13: error: sum(int,int) in <anonymous LambdaExpresionStep1$1> cannot 
// implement sum(int,int) in Inter1
//                         void sum(int x,int y)
//                              ^
//   attempting to assign weaker access privileges; was public
// 1 error



// because Inter1 ki sum method public ha or anonymous class ma sum 
// metod ko overide kiya ha vo by default default ha
// */

//.........................STEP-3.................

@FunctionalInterface
// interface Inter1
// {
// void sum(int x,int y);

// }
// class LambdaExpresion
// {
// 	public static void main(String ar[])
// 	{
// 		Inter1 i=new Inter1()
// 		{
// 			public void sum(int x,int y)
// 			{
// 				System.out.println(x+y);
// 			}
// 		};
	
// 		i.sum(10,20);
// 	}
// }

// /* 

// output  30


// */

//.........................STEP-4.................

// this exaple for addition of two number using lamda expresion 

// @FunctionalInterface
// interface Inter1
// {
// void sum(int x,int y);

// }
// class LambdaExpresion		
// {
// 	public static void main(String ar[])
// 	{
// 		Inter1 i=( x ,y)->
			
// 				System.out.println(x+y);
			
	
	
// 		i.sum(20,20);
// 	}
// }

// /* 

//  interface ma ak hi method ha too override ka time method name nhi define kera ga tabh bhi chala ga
//  or varible type bhi define nhi kerga or body hata denga tabh hi chala ga
 
 
//  above example ma isa type infrares kehta ha 
 
 
//  lamda expresion ka case ma interface ma ak hi abstract method hona chahiya tabhi work kera gi above condition
 

// output  40

// */

//.........................STEP-5.................

// this exaple for addition of two number using lamda expresion 

// @FunctionalInterface
// interface Inter1
// {
// 	boolean test(int x);

// }
// class LambdaExpresion			
// {
// 	public static void main(String ar[])
// 	{
// 		Inter1 i=( x)->
// 		{
// 			return x>18;
// 		};
// 		System.out.println(i.test(10));
	
	
// 	}
// }

// /* 
// output  false

// */

//.........................STEP-6.................

// this exaple for addition of two number using lamda expresion 

// @FunctionalInterface
// interface Inter1
// {
// 	boolean test(int x);

// }
// class LambdaExpresion		
// {
// 	public static void main(String ar[])
// 	{
// 		Inter1 i=( x)->
// 		{
// 			return x>18;
// 		};
// 		System.out.println(i.test(20));
	
	
// 	}
// }

// /* 
// note single statement ka liya return type likhna compilsory  nhi hota ha lamda expresion ma

// OUT PUT true
// */

//.........................STEP-7.................

// this exaple for addition of two number using lamda expresion 

// @FunctionalInterface
// interface Inter1
// {
// 	boolean test(int x);

// }
// class LambdaExpresion	
// {
// 	public static void main(String ar[])
// 	{
// 		Inter1 i=( x)->x>18;
		
// 		System.out.println(i.test(20));
	
	
// 	}
// }

// /* 
// note single statement ka liya return type likhna compilsory  nhi hota ha lamda expresion ma

// OUT PUT true
// */

//.........................STEP-8.................

// this exaple for addition of two number using lamda expresion 

// @FunctionalInterface
// interface Inter1
// {
// 	boolean test(int x);

// }
// class LambdaExpresion	
// {
// 	public static void main(String ar[])
// 	{
// 		Inter1 i=( x)->x>18;
		
// 		System.out.println(i.test(20));
	
	
// 	}
// }

// /* 
// note single statement ka liya return type likhna compilsory  nhi hota ha lamda expresion ma

// out put  true
// */



//.........................STEP-9.................

// this exaple for addition of two number using lamda expresion 

// @FunctionalInterface
// interface Inter1
// {
// 	boolean test(int x);

// }
// class LambdaExpresion
// {
// 	public static void main(String ar[])
// 	{
// 		Inter1 i=x->true;
		
// 		System.out.println(i.test(10));
	
	
// 	}
// }

// /* 
// note single statement ka liya return type likhna compilsory  nhi hota ha lamda expresion ma

// out put  always ture output ayga
// */

//.........................STEP-10.................

// this exaple for addition of two number using lamda expresion 

// @FunctionalInterface
// interface Inter1<T>//t ko capital smal la sakta ha ya koi bhi alphabet la sakta ha uper case lower case any
// {
// 	boolean test(T  x);

// }
// class LambdaExpresion
// {
// 	public static void main(String ar[])
// 	{
// 		Inter1 i=x->true;
		
// 		System.out.println(i.test('a'));
	
	
// 	}
// }

// /* 
// note single statement ka liya return type likhna compilsory  nhi hota ha lamda expresion ma

// template type declare kerna int Sting kuch bhi pass ker sakta ha method parameter ma
// out put  always ture  ayga
// */

//.........................STEP-11.................

// this exaple for addition of two number using lamda expresion 

// @FunctionalInterface
// interface Inter1<T>//t ko capital smal la sakta ha ya koi bhi alphabet la sakta ha uper case lower case any
// {
// 	boolean test(T  x);

// }
// class LambdaExpresion
// {
// 	public static void main(String ar[])
// 	{
// 		Inter1 <Integer>i=x->x>18;
		
	
// 		System.out.println(i.test(10));
// 		System.out.println(i.test(20));
	
// 	}
// }

// 		//<Integer> this genric type now hum method parameter ma sirf Integer value he pass ker sakta ha
// /* 
// note single statement ka liya return type likhna compilsory  nhi hota ha lamda expresion ma

// template type declare kerna int Sting kuch bhi pass ker sakta ha method parameter ma
// out put  always ture  ayga
// */

//.........................STEP-12.................

//import java.util.function.Predicate;
// class LambdaExpresion

// {// lamda expresion for predicate interface
// 	public static void main(String ar[])
// 	{
// 		Inter1 <Integer>i=x->x>18;
// 		System.out.println(i.test(10));
// 		System.out.println(i.test(20));
	
// 	}
// }
// /* 
// false
// true

// */