#include<stdio.h>
int binarySearch(int x[],int se,int n)
{
int si=0;
int mid;
while(si<=n)
{
mid=(si+n)/2;
printf("%d\n",mid);
if(se==x[mid])return mid;
else if(se<x[mid]) n=mid-1;
else si=mid+1;
}
return -1;
}
void main()
{
int n=10;
int x[]={2,5,8,10,12,15,18,50,80,90};
printf("%d\n",binarySearch(x,80,n));
}