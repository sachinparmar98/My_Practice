import java.util.function.Predicate;
class PredicateInterfaceIsEqualMethodWorkingStep1
{     
public static void main(String ar[])
{
       Predicate<String>p1=Predicate.isEqual("ram");
  
  System.out.println(p1.test("ram"));
  System.out.println(p1.test("ram ji"));

}}

/*
op =>
true 
false


note = Predicate interface  isEqual method internaly overide test method
*/

