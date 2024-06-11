class cSortWithGap2
{
static void csort(int x[],int n,int g)
{
if(g<=1)return;
int i;
int t;
for (i=0;i<n-g;i++)
{
if(x[i]>x[g+i])
{
t=x[i];
x[i]=x[i+g];
x[i+g]=t;
display(x);
}
}
csort(x,n,g/2);

}
 static void display(int x[])
{
for(int i=0;i<13;i++)
{
System.out.printf("%d ",x[i]);
}
System.out.printf("\n");
}
public static void main(String ar[])
{
int n=13;
int i;
int x[]={5,0,6,2,7,1,8,4,9,3,12,11,5};
csort(x,n,n/2);
}}