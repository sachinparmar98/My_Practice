@FunctionalInterface
interface Inter1
{
void show(int x,int y);
 void sum(int x){}

}

/* 
FunctionalinterfaceStep4.java:5: error: interface abstract methods cannot have body
 void sum(int x){}
                ^
FunctionalinterfaceStep4.java:1: error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  Inter1 is not a functional interface
    multiple non-overriding abstract methods found in interface Inter1
2 errors
 */
 // interface ki method ma public abstract automatic add ho jata ha