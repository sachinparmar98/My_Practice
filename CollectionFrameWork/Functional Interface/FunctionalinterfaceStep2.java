@FunctionalInterface
interface Inter1
{
void show(int x,int y);
void show2(int x);
}

/* FunctionalinterfaceStep2.java:1: error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  Inter1 is not a functional interface
    multiple non-overriding abstract methods found in interface Inter1
1 error */