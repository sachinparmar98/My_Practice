#include<stdio.h>
#include<conio.h>
#include<stdbool.h>
 

//***********************************insert value in array and display them
/*

void main()
{
	
	int x[5];
	for(int i=0;i<5;i++)
	{x[i]=i*10+10;
	printf("%d  ",x[i]);
	}
}
*/

//************************************program to add element of an array


/*

void main()
{
	int sum=0;
	int x[5]={11,22,33,44,55,};
	for(int i=0;i<5;i++)
	{
		sum=x[i]+sum;
	}
	printf("Addition of array element is=%d",sum);
}
*/

//****************************program to count even an odd number in Array

/*


 
void main()
{
	int even=0,odd=0;
	int x[8]={11,22,33,44,55,66,30,62,};
	for(int i=0;i<8;i++)
	x[i]%2==0?++even:++odd;
	printf("total even array element is=%d\ntotal oddd array element is=%d",even,odd);
	
}
*/

//*************************program to find the largest and smallest element in array


 /*
void main()
{
	
	int x[8]={11,22,33,4,75,-66,130,2,};
	int max=x[0],min=x[0];
	for(int i=1;i<8;i++)
	{
//		if(min>x[i]) min=x[i];   //both statement work
	// else if(max<x[i])max=x[i];
      
	  if(min>x[i]) min=x[i];
	 else if(max<x[i])max=x[i];
      
	}
	printf("max array element is=%d\nmin array element is=%d",max,min);
	
}

*/

//*************************program to reverse the element of an array

/*
void main()
{
	
	int x[8]={11,22,33,4,75,-66,130};
	
	int n=7;
	int l=n;
	for(int i=0;i<n/2;i++)
	{	int swap =x[i];
	x[i]=x[--l];
	x[l]=swap;
	}
	for(int i=0;i<n;i++)
	{
		printf("%d  ",x[i]);
	}
	
}

*/

//************************ program for convert decimal to binary
int binary=0;
int deciToBi(int n)
{        
	if(n<=0){
		printf("Binary number is=");
		int x=binary;
		binary=0;
		return x;
		}
	
	deciToBi(n/2);
	binary=binary*10+n%2;
	printf("%d",n%2);
}
void main()
{
  int x = 32;
  int y=deciToBi(x);
   
printf("\n%d",y); 
}