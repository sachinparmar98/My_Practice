@FunctionalInterface
interface Inter1
{
	 boolean test(String s);
	static Inter1 isEqual(String s)
	{
		return s1->s1.equals(s);
	}
	
}
class PredicateInterfaceIsEqualMethodWorkingStep2
{     

public static void main(String ar[])
{
       Inter1 p1=Inter1.isEqual("sita");
  
  System.out.println(p1.test("sita"));
  System.out.println(p1.test("sita ji"));

}}

/*
op =>
true 
false


note = Predicate interface  isEqual method internaly overide test method
*/

