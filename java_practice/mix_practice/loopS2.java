/*loop 10
*				  *                 
* *             * *
* * *       * * * *
* * * *   * * * * *
* * * * * * * * * *
*/
/*
class loopS2
{
static public void main(String ar[])
{
int a=1,b=1,column=10,row=5;
while(b<=row)
{
if((b==1&&(a>1&&a<10))|| (b==2&&(a>2&&a<9))||
(b==3&&(a>3&&a<7))||(b==4&&(a>4&&a<6)))
{
System.out.print("  ");      
a++;
}
else
{
System.out.print(" *");
a++;
}
if(a-1==cloumn)
{
System.out.println();
a=1;
b++;
}
}
}
}
*/
/*                                               loop 13
3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3 */
/*
   class loopS2
   {
	   static public void main(String ar[])
	   {
		   int a=1,b=1,rc=5;//rc=row column
	   while(b<=rc)
	   {
		   if(a==1||a==5||b==1||b==5)
		   {
			   System.out.print(" 3"); a++;
		   }
		   else if(a==3&&b==3)
		   {
			   System.out.print(" 1"); a++;
		   }
		   else
		   {
			   System.out.print(" 2"); a++;
		   }
		   if(a-1==rc)
		   {
	   System.out.println();
	   a=1;
	   b++;
	   }
   }}}
   */
/*loop14
1
A B
1 2 3
A B C D
1 2 3 4 5								   
 */
/*
class loopS2
{
	static public void main(String ar[])
	{
		int a=0,b=1,row=5;
		char ch=65;
		while(b<=row)
		{
		if(b%2==1)
		{
			System.out.print(++a+" ");
		}
		else
		{
			a++;
			System.out.print((ch++)+" ");
		}
		if(a==b)
		{
			System.out.println();
			a=0;
			ch=65;
			b++;
		}
		}
}}

*/
/*loop15
1
1   2
1       3
1           4
1   2   3   4   5					   
*/
/*
class loopS2					   
{
	static public void main(String ar[])
	{
		int a=0,b=1,row=5,s=0;
		while(b<=row)
		{
			if(s<row)
			{
				System.out.print("  ");
				s++;
			}
			 else if(s==row&&(a==0||a+1==b||b==row))
			{
				System.out.print(" "+(++a)+"  ");
			}
			else
			{
				System.out.print("    ");
				a++;
			}
			if(a==b)
			{
				System.out.println();
				a=0;
				s=b;
				b++;
			}
		}
	}
}
*/
/*loop19
0 1 1 1 1 1 0
1 0 0 0 0 0 1
1 0 0 0 0 0 1
1 0 0 0 0 0 1
1 0 0 0 0 0 1
1 0 0 0 0 0 1
0 1 1 1 1 1 0					
*/
/*						
class loopS2
{
	static public void main(String ar[])
	{
		int a=1,rc=7,b=1;
		while(b<=rc)
		{
			if((b==1||b==rc)&&(a>1&&a<rc)||(a==rc||a==1)&&(b>1&&b<rc))
			{
				System.out.print(" 1");
				a++;
			}
			else
			{
			System.out.print(" 0");	
			a++;
			}
			if(a-1==rc)
			{
				System.out.println();
				a=1;
				b++;
			}
		}
	}
}						  
*/
/*loop20
*           *
* *       * *
*   *   *   *
*     *     *
*           *
*           *
*           *					   
*/
/*
class loopS2
{
	static public void main(String ar[])
	{
		int a=1,b=1,rc=7;//rc=row column
		while(b<=rc)
		{
			if(a==1||a==rc||(a==b&&b<5)||(a+b==8&&b<4))
			{
				System.out.print(" *");a++;
			}
			else
			{
				System.out.print("  ");a++;
			}
			if(a-1==rc)
			{
				System.out.println();
				a=1;
				b++;
			}
		}
	}
}		
*/
/*loop21
*     *     *
*   *   *
* * *
*
* * * * * * * * *
*
* * *
*   *   *
*     *     *					 
*/
/*					 
class loopS2
{
	static public void main(String ar[])
	{
		int a=1,b=1,rc=9;
		while(b<=rc)
		{
			if(b==5 || a==5 || ((a-b==1||a+b==rc) && b<4)
				||((a+b==11||b-a==1)&&b>6 ))
				{
					System.out.print(" *");
				a++;
				}	
				else
				{
					System.out.print("  ");
				a++;
				}
	if(a-1==rc)
	{
		System.out.println();
		a=1;
		b++;
	}
	}	
	}
}					 
*/
/*loop22
A

B B B

C C C C C

D D D D D D D

E E E E E E E E E

F F F F F F F

G G G G G

H H H

I

*/
/*			  
class loopS2
{
static public void main(String ar[])
{
	int n=5,s=0,limit;
	char ch=65;
	for(int i=1;i<=n*2-1;i++)
	{
		limit=i<=n?++s:--s;
		for(int j=s;j<=n;j++)
		{
			System.out.print("  ");
		}
		for(int k=1;k<=s*2-1;k++)
		{
			System.out.print(" "+ch);
		}
		System.out.printf("%n%n");
		ch++;
	}
}
}				  
*/
/*        
                             loop23  
 * * * * *
 * * * *
 * * *
 * *
 *
 * *
 * * *
 * * * *
 * * * * *

*/
/* 
class loopS2
{
	static public void main(String ar[])
	{
		int a=1,b=1,n=5,s=n,limit=n;
		while(b<=n*2-1)
		{
			System.out.print(" *");
			
			if(a==limit)
			{
				b++;
			limit=b<=n?--s:++s;
				a=0;
				System.out.println();
			}
              a++;			
			}
		}
}

*/
/*                       loop25

 *
 - -
 * * *
 - - - -
 * * * * *
 - - - -
 * * *
 - -
 *

*/
/*
class loopS2
{
	static public void main(String ar[])
	{
		int a=1,b=1,n=5,limit=1,s=1;
		while(b<=n*2-1)
		{
			if(b%2==0)
			{
				System.out.print(" -");
			}
			else
			{
				System.out.print(" *");
			}
		if(a==limit)
		{
			b++;
			limit=b<=n?++s:--s;
			a=0;
			System.out.println();
		}
		a++;
		}
		
	}
}
*/

/*                     loop27
 p
 q p
 r q p
 s r q p
 t s r q p
*/
/*
class  loopS2
{
	static public void main(String ar[])
	{
		int a=1,b=1,n=5;
		char ch=112;
		while(b<=n)
		{
			System.out.print(" "+ch--);
			if(a==b)
			{
				System.out.println();
				b++;
				ch+=b;
				a=0;
			}
			a++;
		}
	}
}
*/
/*                    loop28
 A B C D
 E F G H
 I J K L
 M N O P
*/
/*
class loopS2
{
	static  public void main(String ar[])
	{
		int a=1,b=1,n=4;
		char ch=65;
		while(b<=n)
		{
			System.out.print(" "+ch++);
			if(a==n)
			{
				System.out.println();
				a=0;
				b++;
			}
		a++;
		}
	}
}
*/

/*                   loop30
 # # 1 # #
 # # 1 # #
 o o 1 o o
 # # 1 # #
 # # 1 # #
*/
/*
class loopS2
{
	static public void main(String ar[])
	{
		int a=1,b=1,odd=9;
		while(b<=odd)
		{
			if(odd/2+1==a)
			{
				System.out.print(" 1");
			}
		else if(odd/2+1==b)
		{
		System.out.print(" o");	
		}
		else
		{
			System.out.print(" #");
		}
		if(a==odd)
		{
			System.out.println();
			a=0;
			b++;
		}
		a++;
		}
	}
}
*/

/*               loop31
 1 o o o o o 1
 o 1 o o o 1 o
 o o 1 o 1 o o
 o o o 1 o o o
 o o 1 o 1 o o
 o 1 o o o 1 o
 1 o o o o o 1

*/
/*
class loopS2
{
	static public void main(String ar[])
	{
		int a=1,b=1,n=7;
		while(b<=n)
		{
			if(a==b||a+b==n+1)
			{
				System.out.print(" 1");
			}
		else
		{
			System.out.print(" o");
		}
if(a==n)
{
	System.out.println();
a=0;
b++;
}	
	a++;
	}
	}
}
*/

/*             loop33
 @ @ @ @ @ !
 @ @ @ @ ! @
 @ @ @ ! @ @
 @ @ ! @ @ @
 @ ! @ @ @ @
 ! ! ! ! ! !
*/
/*
class loopS2

{
	static public void main(String ar[])
	{
		int a=1,b=1,n=6;
		while(b<=n)
		{
			if(a+b==n+1||b==n)
			{
				System.out.print(" !");
			}
			else
			{
				System.out.print(" @");
			}
			if(a==n)
			{
				System.out.println();
				a=0;
				b++;
			}
			a++;
		}
	}
}
*/
/*                    loop34 
 1
 2 0 2
 3 0 0 0 3
 4 0 0 0 0 0 4
 5 0 0 0 0 0 0 0 5
*/
/*
class loopS2
{
	static public void main(String ar[])
	{
		int a=1,b=1,row=5,s=1;
		while(b<=row*2-1)
		{
			if(a==1||b==a)
			{
				System.out.print(" "+s);
			}
			else
			{
				System.out.print(" 0");
			}
			if(a==b)
			{
				System.out.println();
				a=0;
				b+=2;
				s++;
			}
			a++;
		}
	}
}  
*/
/*                       loop35
 1
 2 4
 7 11 16
 22 29 37 46
 56 67 79 92 106
*/
/*
class loopS2
{
	static public void main (String ar[])
	{
		int a=1,b=1,n=5,s=0,p=1;
		while(b<=n)
		{
			System.out.print(" "+p);
			s++;
			p=p+s;
			if(a==b)
			{
				System.out.println();
				a=0;
				b++;
			}
			a++;
		}
	}
}
*/
/*                           loop36
         *
       * *
     * * *
   * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
*/
/*
class loopS2
{
	static public void main(String ar[])
	{
		int a=0,b=1,n=5,s=1;
		while(b<=n*2-1)
		{
			if(s<n)
			{
				System.out.print("   ");
				s++;
			}
			if(s==n||s>n)
			{
				System.out.print("  *");
			a++;
			}
			if((a==b&&b<=n)||(b>n&&a==n*2-b))
            {
				System.out.println("\n");
				a=0;
				b++;
				s=b;
			}
}
	
	}
}
*/
/*                   loop37
 
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 
*/
/*
class loopS2
{
	static public void main(String ar[])
	{
		int a=1,b=1,n=5,limit=1,s=1;
		while(b<=n*2-1)
		{
			System.out.print(" *");
			if(a==limit)
			{
				System.out.println();
				b++;
				limit=b<=n?++s:--s;
				a=0;
			}
		a++;
		}
	}
}
*/

/*                loop38
           A

         B   B

       C       C

     D           D

   E               E

     F           F

       G       G

         H   H

           I

*/
/*
class loopS2
{
	static public void main(String ar[])
	{
		int n=5,s=0,limit;
		char ch=65;
		for(int i=1;i<=n*2-1;i++)
		{
			limit=i<=n?++s:--s;
			for(int j=s;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=s*2-1;k++)
			{
				if(k==1||k==s*2-1)
				{
				System.out.print(" "+ch);
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.printf("%n%n");
			ch++;
		}
	}
}				  
*/
/*                                loop39
     * *       * *
   * * * *   * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
   * * * * * * * * *
     * * * * * * *
       * * * * *
         * * *
           *
*/
/*
class loopS2
{
	static public void main(String ar[])
	{
		int a=1,b=1,row=9,column=11;
		while(b<=row)
		{
			if((a>2&&a<5&&b==1) || (a>7&&a<10&&b==1) || 
			(a>1&&a<6&&b==2) || (a>6&&a<11&&b==2) || (b==3) || (b==4) ||
			(a>1&&a<11&&b==5) || (a>2&&a<10&&b==6) || (a>3&&a<9&&b==7) ||
            (a>4&&a<8&&b==8) || (a>5&&a<7&&b==9))

			{
				System.out.print(" *");
			}			
			else
			{
				System.out.print("  ");
			}
		if(a==column)
		{
			System.out.println();
			a=0;
			b++;
		}
		a++;
		}
	}
}
*/
/*                         loop40
           *
         *   *
       *       *
     *           *
   *               *
     *           *
       *       *
         *   *
           *
*/
/* 
class loopS2
{
	static public void main(String ar[])
	{
		int s=0,limit,n=5;
		for(int i=1;i<=n*2-1;i++)
		{
			limit=i<=n?++s:--s;
			for(int k=limit;k<=n;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=limit*2-1;j++)
			{
				if(j==limit*2-1||j==1)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}
	}
}
*/

/*                         loop41
 * * * * * * * * *
 * * * *   * * * *
 * * *       * * *
 * *           * *
 *               *
 * *           * *
 * * *       * * *
 * * * *   * * * *
 * * * * * * * * *
*/
/*
class loopS2
{
	static public void main(String ar[])
	{
		int a=1,b=1,rc=9;
		while(b<=rc)
		{
			if(b==1 || a==1 || b==rc || a==rc || (a>1&&a<5&&(b==2||b==8))
			   ||(a>5&&a<rc&&(b==2||b==8)) || (a>1&&a<4&&(b==3||b==7)) ||
		   ((b==3||b==7)&&a<rc&&a>6) ||((b==4||b==6)&&(a==2||a==8)) ) 
			   
			{
			System.out.print(" *");	
			}
			else
			{
				System.out.print("  ");
			}
		if(a==rc)
		{
			System.out.println();
			a=0;
			b++;
		}
		a++;
		}
	}
}
*/
/*                            loop43

 *                 *
 * *             * *
 * * *         * * *
 * * * *     * * * *
 * * * * * * * * * *
 * * * *     * * * *
 * * *         * * *
 * *             * *
 *                 *
*/
/*
class loopS2
{
	static public void main(String ar[])
{
int a=1,b=1,row=9,colm=10;
while(b<=row)
{
if(a==1 || a==colm || b==5 || ((a==2||a==9)&&(b==2||b==8)) || 
((a<4||a>7) && (b==3||b==7)) || ((a>6||a<5)&&(b==4||b==6)))
{
System.out.print(" *");
}
else
{
System.out.print("  ");
}
if(a==colm)
{
System.out.println();
a=0;
b++;
}
a++;
}
}
	
}

*/ //loop 44

/*
         *
       *   *
     *   *   *
   *   *   *   *
 *   *   *   *   *
   *   *   *   *
     *   *   *
       *   *
         *
       *   *
     *   *   *
*/
/*
class loopS2
{
static  public void main(String ar[])
{
int limit=0 ,a=1, n=5, b=1,s=1;
while(b<=n*2-1)
{
if(s<n)
{
System.out.print("  ");
s++;
}
 if(s==n)
{
System.out.print(" *  ");
a++;
}
if((a-1==b)||(limit==a-1&&b>n))
{
System.out.println();
a=1;
b++;
 limit =b>n ? (s=n-(b-n)):(s=b);
}
}
System.out.println("       *   *");
System.out.println("     *   *   *");
}
}

*/
// loop 45
/*
 1 2 3 4 5 6 7 8 9
   1 2 3 4 5 6 7
     1 2 3 4 5
       1 2 3
         1
       1 2 3
     1 2 3 4 5
   1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8 9
*/
/*
class loopS2
{
static  public void main(String ar[])
{
int limit=5 ,a=1, n=5, b=1,s=n;
while(b<=n*2-1)
{
if(limit<n)
{
System.out.print("  ");
limit++;
}
 if(limit==n)
{
System.out.print(" "+a);
a++;
}
if((a-1==s*2-1&&b<=n)||(a-1==s*2-1))
{
System.out.println();
a=1;
b++;
 limit =b>n ? (s=(b-n)+1):(s=n-(b-1));
 
}
}
}
}

*/
//loop 51
/*
 A B C D E F G
   A B C D E
     A B C
       A
     A B C
   A B C D E
 A B C D E F G
*/
/* 
class loopS2
{
static  public void main(String ar[])
{
int n=4,limit=n ,a=0, b=1,s=n;
char ch=65;
while(b<=n*2-1)
{
if(limit<n)
{
System.out.print("  ");
limit++;
}
if(limit==n)
{
System.out.print(" "+(ch++));
a++;
}
if((a==s*2-1&&b<=n)||(a==s*2-1))
{
System.out.println();
a=0;
b++;
limit =b>n ? (s=(b-n)+1):(s=n-(b-1));
ch=65;
}
}
}
}

*/
/*         1                         //
         2 3 2
       3 4 5 4 3
     4 5 6 7 6 5 4
   5 6 7 8 9 8 7 6 5 
   */
/*
 
class SL43
{
public static void main(String ar[])
{

int a=0,b=1,s=0,n=5,count=1,d=0;
while(b<=n*2-1)
{
	if(s<n)
	{
		System.out.print("  ");//c loop 43
s++;
	}
if(s==n)
{
d++;
int p=d<=count?++a:--a;
System.out.print(" "+(p));

}
if(d==b)
{
System.out.println();
d=0;
a=s=count;

count++;
b+=2;
}
}
}

}
*/
/* 
class loopS2 {
	public static void main(String[] args) {
		int a = 0, n = 5, b = n * 2 - 1, s = n;
		while (b >= 1) {
			if (s < n) {
				System.err.print("  ");
				s++;

			}
			if (s == n) {
				System.out.print(" " + (++a));
			}
			if (a == b) {
				System.out.println();
				a = 0;
				b -= 2;
				s = b / 2 + 1;
			}
		}
	}
}

*/
/*1 2 3 4 5 6 7 8 9
   1 2 3 4 5 6 7
     1 2 3 4 5
       1 2 3
         1 */

/* 
		 class loopS2 {
	public static void main(String[] args) {
		int  n = 5,a=n-1, b = n * 2 - 1, s = n,count=0;
		while (b >= 1) {
			if (s < n) {
				System.err.print("  ");
				s++;

			}
			if (s == n) {
				count++;
				if (count<=b/2+1) {
					
				
				System.out.print(" " + (++a));
			}
			else
			{
				System.out.print(" "+(--a));
			}
		}
			if (count == b) {
				System.out.println();
				count=0;
				b -= 2;
				a = b/2;
				s = b / 2 + 1;
			}
		}
	}
}

*/
/*5 6 7 8 9 8 7 6 5
    4 5 6 7 6 5 4
      3 4 5 4 3
        2 3 2
          1 */

/* 
class loopS2
{
	public static void main(String[] args) {
		
		int n=5,a=0,b=1;
		while (b<=n) {
			a++;
			if(a==b||(a+b==n+1))
			{
				System.out.print(" *");
			}
			else
			{
				System.out.print(" "+a);
			}
			if(a==n)
			{
				System.out.println();
				a=0;
				b++;
			}
			
		}
	}
}		  
*/
/*  * 2 3 4 *
 1 * 3 * 5
 1 2 * 4 5
 1 * 3 * 5
 * 2 3 4 * */

 /* 
class loopS2 {
	public static void main(String[] args) {
		int n = 5, a = 0, b = 1, limit = 0, s = 1;
		while (b <= n * 2 - 1) {
			if (s < n) {
				System.out.print(" ");
				s++;
			}
			if (s == n) {
				System.out.print(" *");
				a++;
			}
			if ((a == b) || (limit == a && b > n)) {
				System.out.println();
				a = 0;
				b++;
				limit = b > n ? (s = n - (b - n)) : (s = b);
			}
		}
	}
}
*/
/*   *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *  */
	/* 
class loopS2
{
	public static void main(String[] args) {
		int n=5,a=0,b=1,s=1,limit=1;
		while (b<=n*2-1) {
			if(s<n)
			{
				System.out.print(" ");
				s++;
			}
			if(s==n)
			{
				System.out.print(" "+limit);
				a++;
			}
			if((a==b)||(limit==a&&b>n))
			{
				System.out.println();
                    a=0;
					b++;
					limit=b>n?(s=n-(b-n)):(s=b);
			}
			
		}
	}
}
*/
/*  1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
  4 4 4 4
   3 3 3
    2 2
     1 */
	 class 
	 {
		dsfajpsfsdfjsfsof
		{
			asdfasdjflsdf
			{asf;safs}
		}
 dsfjdsfsadf		
	 }
	 {
		asfsafasfas }