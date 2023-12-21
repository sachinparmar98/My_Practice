                                   //FOR EACH LOOP
/*
class day26
{
public static void main(String ar[])
{
//int x[][]=new int[row][column];
int x[][]={{1,2,3},{11,12,13},{21,22,23},{31,32,33}};
for(int i:x)
{
	System.out.print(i);
}
}
}*/
//error 
//day26.java:8: error: incompatible types: int[] cannot be converted to int
//for(int i:x)
	
                                     //Q2 correct above error
/*
class day26
{
public static void main(String ar[])
{
//int x[][]=new int[row][column];
int x[][]={{01,02,03},{11,12,13},{21,22,23},{31,32,33}};
for(int i[]:x)
{
	for(int j:i)
	{
		System.out.print(j+"  "); 
	}
	System.out.println();
	}
}
}*/
/*out put 
1  2  3
11  12  13
21  22  23
31  32  33					
*/ 
									//Q3
/*
class day26
{
public static void main(String ar[])
{
//int x[][]=new int[row][column];
int x[][]={{41,42,43},{11,12,13},{21,22,23},{31,32,33}};
for(int i[]:x)
{
	for(int j:i)
	{
		System.out.print(j+"  "); 
	}
	System.out.println();
	}
}
}
*/

/*
class day26
{
public static void main(String ar[])
{
//int x[][]=new int[row][column];
int x[][]= {{41,42,43},{11,12,13},{21,22,23},{31,32,33}};
	System.out.println(x[3][2]);
	System.out.println(x[3][0]);
	System.out.println(x[3][3]);//exception
	
}
}
*/
								//Q4
								
class day26
{
public static void main(String ar[])
{
//1 int x[][]=new int[row][column];
//2 int x[][]=new int [4][3];//run
//4 int x[][]=new int [][3];//error
//3 int x[][]=new int [4][];//exception
//int[][]  x=new int [4][3]; run
//int []x[]=new int [4][3];
//int [][]x=new int [4][3];     
//int [] []x=new int [4][3];
//int [] [] x =new int [4][3];
int [] x[]=new int [4][3];
for(int i[]:x)
{
	for(int j:i)
	{
		System.out.print(j+"  "); 
	}
	System.out.println();
	}
}
}
//2
//D:\JAVASACH>java day26
//Exception in thread "main" java.lang.NullPointerException
  //      at day26.main(day26.java:88)
