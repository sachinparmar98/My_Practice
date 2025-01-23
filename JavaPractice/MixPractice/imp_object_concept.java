class A
{}
class B extends A
{}
class C extends A
{}
class imp_object_concept
{
	public static void main(String ar[])
	{
		//case 1 
	   //A a1=new A();
	    //output=>worked
		
		
	//case 2 
	//A a1=new B();
	//output=>worked
		
   //case 3  
 // A a1=new C();
  //output=>worked
  
 //case 4
// B b1=new A();
	 /*output=>
  error: incompatible types: A cannot be converted to B
  B b1=new A();
       ^
	   */
	
	 //case 5
//C c1=new A();
	 /*output=>
  error: incompatible types: A cannot be converted to C
C c1=new A();
     ^
	   */

 //case 6
//B b1=new C();
	 /*output=>
  error: incompatible types: C cannot be converted to B
B b1=new C();
     ^
	   */
	   
	   
 //case 7
//A a1=new A();
//B b1=a1;
	 /*output=>
   error: incompatible types: A cannot be converted to B
B b1=a1;
     ^
  */
	 
//case 8
//A a1=new B();
//B b1=a1;
	 /*output=>
  error: incompatible types: A cannot be converted to B
B b1=a1;
     ^
  */

//case 9
//A a1=new C();
//B b1=a1;
	 /*output=>
   error: incompatible types: A cannot be converted to B
B b1=a1;
     ^
  */  

//case 10
//A a1=new A();
//B b1=(B)a1;
	 /*output=>
  Exception in thread "main" java.lang.ClassCastException: A cannot be cast to B
        at imp_object_concept.main(imp_object_concept.java:78)

  */


//case 11
//A a1=new B();
//B b1=(B)a1;
	 /*output=>
 Worked
  */  
	

//case 12
//A a1=new C();
//B b1=(B)a1;
	 /*output=>
 Exception in thread "main" java.lang.ClassCastException: C cannot be cast to B
        at imp_object_concept.main(imp_object_concept.java:96)

  */
  
  
//case 13
//C c1=new C();
//B b1=(B)c1;
	 /*output=>
 error: incompatible types: C cannot be converted to B
B b1=(B)c1;
        ^
  */
  
   
//case 14
//B b1=new B();
//C c1=(C)b1;
	 /*output=>
  error: incompatible types: B cannot be converted to C
C c1=(C)b1;
        ^
  */

  
	System.out.println("9");
	
	}
}