//.........QUESTION-1............
// #include<stdio.h>
// int show(int a,int b,int n)
// {
// 	if(b<=5){
// 		if(printf("%d ",a)&& a==n && printf("\n") && b++)
// 		{
// 			if(a=0){}
// 		}
// 	  if(show(++a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(1,1,5)){}
// }

//.........QUESTION-2............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b>=n){
//  		if(printf("%d ",a)&& a==b && printf("\n") && b--)
//  		{
//  			if(a=0){}
//  		}
//  	  if(show(++a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(1,5,1)){}
// }

// /*
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// */
//.........QUESTION-3............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b<=n){
//  		if(printf("%d ",a)&& a==n && printf("\n"))
//  		{
//  			if(a=b++){}
//  		}
//  	  if(show(++a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(1,1,5)){}
// }

// /*
// 1 2 3 4 5
// 2 3 4 5
// 3 4 5
// 4 5
// 5

// */
//.........QUESTION-4............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b<=n){
//  		if(printf("%d ",a)&& a==b && printf("\n") && b++)
//  		{
//  			if(a=0){}
//  		}
//  	  if(show(++a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(1,1,5)){}
// }

// /*
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// */
//.........QUESTION-5............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b<=n){
//  		if(printf("%d ",a+1)&& a==0 && printf("\n") )
//  		{
//  			if(a=++b){}
//  		}
//  	  if(show(--a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(0,1,5)){}
// }

// /*
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// */
//.........QUESTION-6............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b<=n){
//  		if(printf("%d ",a)&& a==1&& printf("\n")&& b++ )
//  		{
//  			if(a=n+1){}
//  		}
//  	  if(show(--a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(5,1,5)){}
// }

// /*
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1

// */

//.........QUESTION-7............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b<=n){
//  		if(printf("%d ",a)&& a==b&& printf("\n")&& b++ )
//  		{
//  			if(a=n+1){}
//  		}
//  	  if(show(--a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(5,1,5)){}
// }

// /*
// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4
// 5

// */
//.........QUESTION-8............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b>=n){
//  		if(printf("%d ",a)&& a==b&& printf("\n")&& b-- )
//  		{
//  			if(a=6){}
//  		}
//  	  if(show(--a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(5,5,1)){}
// }

// /*
// 5
// 5 4
// 5 4 3
// 5 4 3 2
// 5 4 3 2 1

// */
//.........QUESTION-9............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b>=1){
//  		if(printf("%d ",a)&& a==n&& printf("\n") && b--)
//  		{
//  			if(a=b-1){}
//  		}
//  	  if(show(++a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(5,5,5)){}
// }

// /*
// 5
// 4 5
// 3 4 5
// 2 3 4 5
// 1 2 3 4 5

// */
//.........QUESTION-10............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b<=n){
//  		if(a==1 && b==1 && printf("6\n")){}
//  		if(printf("%d ",a)&& a==b&& printf("6\n") && b++)
//  		{
//  			if(a=0){}
//  		}
//  	  if(show(++a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(1,1,5)){}
// }

// /*
// 6
// 1 6
// 1 2 6
// 1 2 3 6
// 1 2 3 4 6
// 1 2 3 4 5 6

// */
//.........QUESTION-11............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b<=n){

// 		if(printf("%d ",a+b)&& a==n&& printf("6\n") && b++)
// 		{
// 			if(a=0){}
// 		}
// 	  if(show(++a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(1,1,5)){}
// }

// /*
// 2 3 4 5 6
// 3 4 5 6 7
// 4 5 6 7 8
// 5 6 7 8 9
// 6 7 8 9 10

// */
//.........QUESTION-12............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b<=n){

// 		if(printf("* ")&& a==n&& printf("\n") && b++)
// 		{
// 			if(a=0){}
// 		}
// 	  if(show(++a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(1,1,5)){}
// }

// /*
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// */
//.........QUESTION-13............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b<=n){

// 		if(printf("* ")&& a==b&& printf("\n") && b++)
// 		{
// 			if(a=0){}
// 		}
// 	  if(show(++a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(1,1,5)){}
// }

// /*
// *
// * *
// * * *
// * * * *
// * * * * *
// */
//.........QUESTION-14............

// #include<stdio.h>
//  int show(int a,int b,int n)
//  {
//  	if(b<=n){

// 		if(printf("* ")&& a==n+1-b&& printf("\n") && b++)
// 		{
// 			if(a=0){}
// 		}
// 	  if(show(++a,b,n)){}

// 	}
// }

// void  main()
// {
// if(show(1,1,5)){}
// }

// /*

// * * * * *
// * * * *
// * * *
// * *
// *

// */

//.........QUESTION-15............
// #include<stdio.h>
// // int show(int a,int b,int n)
// // {
// 	// if(b<=n){

// 	// if(a<=b?printf("%d ",a):printf("* ") && a==n && printf("\n") && b++)
// 	// {
// 		// if(a=0){}
// 	// }
// 	// if(show(++a,b,n)){}
// // }}

// void  main()
// {
// // if(show(1,1,5)){}
// int a=10;
// // if((a<=2?printf("true"):printf("false")),if(10<2){a=0},a=33);
// printf("%d",a);
// }

// /*

// * * * * *
// * * * *
// * * *
// * *
// *

// */