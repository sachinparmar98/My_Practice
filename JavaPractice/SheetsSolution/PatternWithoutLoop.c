#include <stdio.h>
void show(int a, int b, int n)
{
	if (b > n)
		return;
	printf("%d  ", a);
	if (a == n)
	{
		printf("\n");
		a = 0;
		b++;
	}
	a++;
	show(a, b, n);
}
void main()
{
	show(1, 1, 5);
}

//................QUESTION-2................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;
//  	printf("%d  ",a);
//  	if(a==n-b+1)
//  	{
//  		printf("\n");
//  		a=0;
//  		b++;
//  	}
//  	a++;
//  	show(a,b,n);
//  }
//  void main()
//  {
//  show(1,1,5);
//  }
//................QUESTION-3................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;
//  	printf("%d  ",a+b-1);
//  	if(a==n-b+1)
//  	{
//  		printf("\n");
//  		a=0;
//  		b++;
//  	}
//  	a++;
//  	show(a,b,n);
//  }
//  void main()
//  {
//  show(1,1,5);
//  }
//................QUESTION-4................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;
//  	printf("%d  ",a);
//  	if(a==b)
//  	{
//  		printf("\n");
//  		a=0;
//  		b++;
//  	}
//  	a++;
//  	show(a,b,n);
//  }
//  void main()
//  {
//  show(1,1,5);
//  }
//................QUESTION-5................

//   #include<stdio.h>
// void show(int a,int b,int n)
// {
// 	if(b>n)return;
// 	printf("%d  ",b-a+1);
// 	if(a==b)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,5);
// }
//................QUESTION-6................

// #include<stdio.h>
// void show(int a,int b,int n)
// {
// 	if(b>n)return;
// 	printf("%d  ",n-a+1);
// 	if(a==n)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,5);
// }
//................QUESTION-7................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;
//  	printf("%d  ",n-a+1);
//  	if(a==n-b+1)
//  	{
//  		printf("\n");
//  		a=0;
//  		b++;
//  	}
//  	a++;
//  	show(a,b,n);
//  }
//  void main()
//  {
//  show(1,1,5);
//  }
//................QUESTION-8................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;
//  	printf("%d  ",n-a+1);
//  	if(a==b)
//  	{
//  		printf("\n");
//  		a=0;
//  		b++;
//  	}
//  	a++;
//  	show(a,b,n);
//  }
//  void main()
//  {
//  show(1,1,5);
//  }

// /*

// 5
// 5  4
// 5  4  3
// 5  4  3  2
// 5  4  3  2  1
// */
//................QUESTION-9................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;
//  	printf("%d  ",n+a-b);
//  	if(a==b)
//  	{
//  		printf("\n");
//  		a=0;
//  		b++;
//  	}
//  	a++;
//  	show(a,b,n);
//  }
//  void main()
//  {
//  show(1,1,5);
//  }

// /*

// 5
// 4  5
// 3  4  5
// 2  3  4  5
// 1  2  3  4  5

// */
//................QUESTION-10................
#include <stdio.h>
// void show(int a,int b,int n)
// {
// 	if(b>n)return;
// 	if(b==1)printf("6\n");
// 	printf("%d  ",a);
// 	if(a==b)
// 	{
// 		printf("6\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,5);
// }

// /*

// 6
// 1  6
// 1  2  6
// 1  2  3  6
// 1  2  3  4  6
// 1  2  3  4  5  6

// */
//................QUESTION-11................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;

// 	printf("%d  ",a+b);
// 	if(a==n)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,5);
// }

// /*

// 2  3  4  5  6
// 3  4  5  6  7
// 4  5  6  7  8
// 5  6  7  8  9
// 6  7  8  9  10

// */
//................QUESTION-12................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;

// 	printf("* ");
// 	if(a==n)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,5);
// }

// /*

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// */
//................QUESTION-13................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;

// 	printf("* ");
// 	if(a==b)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,5);
// }

// /*

// *
// * *
// * * *
// * * * *
// * * * * *

// */

//................QUESTION-14................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;

// 	printf("* ");
// 	if(a==n-b+1)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,5);
// }

// /*

// * * * * *
// * * * *
// * * *
// * *
// *

// */
//................QUESTION-15................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;
//  	if(a<=b)
//  		printf("%d ",a);
//  	else
//  	printf("* ");
//  	if(a==n)
//  	{
//  		printf("\n");
//  		a=0;
//  		b++;
//  	}
//  	a++;
//  	show(a,b,n);
//  }
//  void main()
//  {
//  show(1,1,5);
//  }

// /*

// 1 * * * *
// 1 2 * * *
// 1 2 3 * *
// 1 2 3 4 *
// 1 2 3 4 5

// */
//................QUESTION-16................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;
//  	if(b%2==1)
//  		printf("%d ",a);
//  	else
//  	printf("* ");
//  	if(a==n)
//  	{
//  		printf("\n");
//  		a=0;
//  		b++;
//  	}
//  	a++;
//  	show(a,b,n);
//  }
//  void main()
//  {
//  show(1,1,5);
//  }

// /*

// 1 2 3 4 5
// * * * * *
// 1 2 3 4 5
// * * * * *
// 1 2 3 4 5

// */
//................QUESTION-17................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;
//  	if(a<=b)
//  		printf("%d ",b);
//  	else
//  	printf("%d ",a);
//  	if(a==n)
//  	{
//  		printf("\n");
//  		a=0;
//  		b++;
//  	}
//  	a++;
//  	show(a,b,n);
//  }
//  void main()
//  {
//  show(1,1,5);
//  }

// /*

// 1 2 3 4 5
// 2 2 3 4 5
// 3 3 3 4 5
// 4 4 4 4 5
// 5 5 5 5 5

// */
//................QUESTION-18................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;

// 		printf("%d ",a%2);
// 	if(a==b)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,7);
// }

// /*

// 1
// 1 0
// 1 0 1
// 1 0 1 0
// 1 0 1 0 1
// 1 0 1 0 1 0
// 1 0 1 0 1 0 1

// */
//................QUESTION-19................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;

// 		printf("%d ",(a+b-1)%2);
// 	if(a==b)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,7);
// }

// /*

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// 0 1 0 1 0 1
// 1 0 1 0 1 0 1

// */
//................QUESTION-20................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;

// 		printf("%d ",a%2);
// 	if(a==n-b+1)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,7);
// }

// /*

// 1 0 1 0 1 0 1
// 1 0 1 0 1 0
// 1 0 1 0 1
// 1 0 1 0
// 1 0 1
// 1 0
// 1

// */

//................QUESTION-21................
// #include<stdio.h>
// void show(int a,int b,int n)
// {
// 	if(b>n)return;

// 		printf("%d ",(a+b+1)%2);
// 	if(a==n-b+1)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,7);
// }

// /*

// 1 0 1 0 1 0 1
// 0 1 0 1 0 1
// 1 0 1 0 1
// 0 1 0 1
// 1 0 1
// 0 1
// 1

// */
//................QUESTION-22................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;

// 		printf("%d ",b);
// 	if(a==n)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,5);
// }

// /*

// 1 1 1 1 1
// 2 2 2 2 2
// 3 3 3 3 3
// 4 4 4 4 4
// 5 5 5 5 5

// */
//................QUESTION-23................

// #include<stdio.h>
//  void show(int a,int b,int n)
//  {
//  	if(b>n)return;

// 		printf("%d ",b);
// 	if(a==b)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,5);
// }

// /*

// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

// */
//................QUESTION-24................
// #include<stdio.h>
// void show(int a,int b,int n)
// {
// 	if(b>n)return;

// 		printf("%d ",n-b+1);
// 	if(a==b)
// 	{
// 		printf("\n");
// 		a=0;
// 		b++;
// 	}
// 	a++;
// 	show(a,b,n);
// }
// void main()
// {
// show(1,1,5);
// }

// /*

// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// */
//................QUESTION-2................
//................QUESTION-2................