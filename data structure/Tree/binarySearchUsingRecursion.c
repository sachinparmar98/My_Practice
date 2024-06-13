#include<stdio.h>
int si=0;
int binarySearch(int x[],int se,int n)
{

int mid;
if(si>=n)return -1;
mid=(si+n)/2;
if(se==x[mid])return mid;
else if(se<x[mid]) n=mid-1;
else si=mid+1;
binarySearch(x,se,n);
}
void main()
{
int n=10;
int x[]={2,5,8,10,12,15,18,50,80,90};
printf("%d\n",binarySearch(x,90,n));
}