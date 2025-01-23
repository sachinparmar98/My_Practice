#include<stdio.h>
#include<stdbool.h>
#define SIZE 5
#define MAX 2147483647
void algo();
void showAll();
int min_index();
void main()
{
int x[SIZE][SIZE]={
{0,6,0,1,0},{6,0,5,2,2},{0,5,0,0,5},{1,2,0,0,1},{0,2,5,1,0}};
algo(x,0);
}
void algo(int x[SIZE][SIZE],int s)
{
int output[SIZE];
bool b[SIZE];
int i,j;
for( i=0;i<SIZE;i++)
{
output[i]=MAX;
b[i]=false;
}
output[s]=0;
for(i=0;i<5;i++)
{
int m=min_index(output,b);
b[m]=true;
for(j=0;j<SIZE;j++)
{
if(x[m][j]!=0 && b[j]==false && output[j]>output[m]+x[m][j])
{
output[j]=output[m]+x[m][j];
}
}
}
showAll(output);
}
void showAll( int output[])
{
int i;
printf("city \t distance \n");
for(i=0;i<SIZE;i++)
printf("%d \t %d \n",i,output[i]);
}

int min_index(int output[] ,bool b[])
{int i;
int min_v=MAX;
int min_i=-1;
for(i=0;i<SIZE;i++)
{
if(b[i]==false && min_v>output[i])
{
min_v=output[i];
 min_i=i;
}

}
return min_i;
}
