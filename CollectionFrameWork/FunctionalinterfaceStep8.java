@FunctionalInterface
interface Inter1
{
void sum(int x,int y);

}
@FunctionalInterface
interface Inter2 extends Inter1
{
	
 
  void sum2(int x,int y);
}

/* 
FunctionalinterfaceStep7.java:7: error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  Inter2 is not a functional interface
    multiple non-overriding abstract methods found in interface Inter2
1 error


because extends kerna per Inter2 ma 2 abstract methods ho gai ha
 */