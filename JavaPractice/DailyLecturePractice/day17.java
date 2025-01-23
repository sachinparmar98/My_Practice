
/*                                //Q1 
class day17
{
static public void main(String ar[])
{
int x[]={10,20,30,40,50};
for(int i=0;i<8;i++)
{
System.out.print(x[i]+" ");
}
}
}
*/

 /*                                 //Q2
class day17
{
static public void main(String ar[])
{
int x[]={10,20,30,40,50,60};
for(int i=0;i<5;i++)
{
System.out.println(x[++i]);
}
}
}
*/

/*                                    //Q3
class day17
{
static public void main(String ar[])
{
int x[]={10,20,30,40,50,60};
for(int i=0;i<5;i++)
{
System.out.println(++x[++i]);
}
}
}
*/
                                    //Q4
/*
class day17
{
static public void main(String ar[])
{
int x[]={10,20,30,40,50};
int y;
y=x;
for(int i:y)
{
System.out.print(i);
} 
}
}
*/
/*day17.java:51: error: incompatible types: int[] cannot be converted to int
y=x;
  ^
day17.java:52: error: for-each not applicable to expression type
for(int i:y)
          ^
  required: array or java.lang.Iterable
  found:    int
*/
/*                                //Q6 concept array memory sharing 
class day17
{
static public void main(String ar[])
{

int x[]={10,20,30,40,50};
int y[]=new int[5];
for(int i=0;i<5;i++)
{
y[i]=x[i];
}
y[2]=555;
System.out.print("x=>  ");
for(int i:x)
{
System.out.print(i+" ");
}
System.out.print("\ny=>  ");

for(int i:y)
{
System.out.print(i+" ");
}
}
}
*/
                               //Q7 array memoryshare concept
/*
class day17
{
static public void main(String ar[])
{
int x[]={10,20,30,40,50};
int y[]=new int[5];
y=x;
y[2]=555;
System.out.print("x=> ");
for(int i:x)
{
System.out.print(i+" ");
}

System.out.print("\ny=> ");
for(int i:y)
{
System.out.print(i+" ");
}

}
}
*/