@FunctionalInterface
interface Inter1
{
void sum(int x,int y);

}
@FunctionalInterface
interface Inter2
{
	
  void sum(int x,int y);
  void sum2(int x,int y);
}

/* 

FunctionalinterfaceStep7.java:7: error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  Inter2 is not a functional interface
    multiple non-overriding abstract methods found in interface Inter2
1 error

 */