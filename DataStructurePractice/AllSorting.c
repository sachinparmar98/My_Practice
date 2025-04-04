

/*
1  display 1 d array
2  display 2 d array
3  n queen problem
4  string anagram or not
5  count chrarcter in string
6  ocurence count
7  insertion sort
8  max heap
9  pattern without loop and simicolon
10 pattern without semicolon
11 Selction Sort
12 addition of n number without + operator
13 Pattern using xor(^) operator
14 CountSort
15 LinkedList
16 bubble sort
*/
#include <stdio.h>
#include <conio.h>
#include <stdbool.h>
#include <stdlib.h>
// Q1 ***************display 1 d array*******************

void display(int x[], int n)
{
	for (int i = 0; i < n; i++)
		printf("%d\t", x[i]);
	printf("\n");
}
// Q2 ***************dispaly 2 d array******************

void display2D(int x[4][4], int n)
{
	for (int i = 0; i < n; i++)
	{
		{
			for (int j = 0; j < n; j++)
				printf("%d ", x[i][j]);
		}
		printf("\n");
	}
}
//.............................................N queen Problem.......................
/*
bool isValid(int x[4][4],int r,int c)
{
	int i,j;
	for( i=r;i>=0;i--)
	{
		if(x[i][c])return false;
	}
	for(i=r,j=c;i>=0 && j>=0;i--,j--)
	{
		if(x[i][j])return false;
	}
	return true;
}
bool show(int x[4][4],int r){
	int j;
	if(r>=4)return true;
	for( j=0;j<4;j++)
	{
		if(isValid(x,r,j))
		{
			x[r][j]=1;
		if(show(x,r+1))return true;//C:\Users\SHIVA\OneDrive\Documents\NetBeansProjects\SessionTask\web\login.jsp
		x[r][j]=0;
		}

	}
	return false;
}
void main()
{
	int x[4][4]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	show(x,0);
	display2D(x,4);
}
*/

//................................String is Anagram or Not Anagram..................................
/*
void isAnagram(char s1[] ,char s2[],int n1,int n2)
{
if(n1!=n2){printf("Stirng is not Anagram\n");return;}
int x[26]={0};
int y[26]={0};
int i=0;
while(s1[i]!='\0')
{
	x[s1[i]-97]++;
	y[s2[i]-97]++;
i++;
}
i=0;
while(x[i]==y[i]&&i<26)i++;
if(i==26)
printf("String is anagram\n");
else
	printf("string is not anagram\n");
}
void main()
{
	char s1[]="ichana";
	char s2[]="nihcaa";
	int n1=6;
	int n2=6;
	isAnagram(s1,s2,n1,n2);
}

*/

//................................... count charcater in String ............................
/*
int countChar(char s[],char c)
{ if(c<=90)c=c+32;
	int x[26]={0};
	int i=0;
	while(s[i]!='\0')
	{
	if(s[i]>=97&&s[i]<=122)x[s[i]-97]++;
	else if(s[i]>=65&&s[i]<=90)x[s[i]-65]++;
	i++;
	}
	return  x[c-97];
}
void main()
{
	char s1[]="my zzzZnamekkkkk is sachinllLLlLL";

	 int x=countChar(s1,'L');
	 printf("character times=%d",x);
}

*/

// .......................count character occurence inside in String ..............................
/*
void CharOcurs(char s[])
{
	int x[26]={0};
	int i=0;
	while(s[i]!='\0')
	{
	if(s[i]>=97&&s[i]<=122)x[s[i]-97]++;
	else if(s[i]>=65&&s[i]<=90)x[s[i]-65]++;
	i++;
	}
	i=0;
	while(i<26)
	{
		printf("%c occurs total times =>  %d\n\n",i+65,x[i]);
i++;
	}
}
void main()
{
	char s1[]="my gzzzGZnamGekkkkgk isg sachinllLLlLL";

	 CharOcurs(s1);
	 printf("%d     %d\n",printf("ram\n"),printf("ram ji\n"));

	//printf method ma double cot ka bad ka
	// content right sa execute hota ha or
	//double cot ka ander ka content left
	//sa execute hota ha

} */

//.............................Insertion Sort.....................................

/*
void insrSort(int x[],int n)
{int j;
	for(int i=1;i<n;i++)
	{
		int value=x[i];
		for( j=i;j>0;j--)
		{
			if(value<x[j-1])
				x[j]=x[j-1];
			else
				break;


		}
		x[j]=value;
	}
}
void main()
{
	int x[]={2,4,87,90,-67,54,34,21,98,-1};
	int n=10;
	insrSort(x,n);
	for(int i=0;i<n;i++)
		printf("%d\t",x[i]);
}

*/

// ......................................Max Heap.....................................

/*
void maxHeapSort();
void sort(int [],int ,int);
void delete(int x[],int n)
{
	for(int i=n-1;i>0;i--)
	{
	   int swap =x[0];
		x[0]=x[i];
		x[i]=swap;
	sort( x,i,0);}

}

void sort(int x[],int n,int node)
{
	int l=node*2+1;
	int r=node*2+2;
	int max=node;

	if(r<n)
	{
	if(x[l]>x[r])
		max=l;
	else
		max=r;
	}
	else if(l<n)
		max=l;
  if(x[max]>x[node])
  {
	  int swap=x[node];
	  x[node]=x[max];
	  x[max]=swap;
	  sort(x,n,max);
  }

}
void maxHeapSort(int x[],int n)
{
	for(int i=n/2-1;i>=0;i--)
		sort(x,n,i);}

void main()
{
int x[]={13,2,34,4,54,6,70,8,9,10};
int n=10;
maxHeapSort(x,n);
delete(x,n);
display(x,n);

}
*/

//..............................................Patern without loop and Semicolon.......................
/*int  patan(int a,int b,int n)
{
	if(b<=n){

	if(printf("* ")&& 	a==n && printf("\n",a=0,b++)){}
		if(patan(++a,b,n)){}
	}

	return 0;//return 0 nahi kera ja tabh bhi chala ga but function ka return type int hona chahiya
}
void main()
{

	if(patan(1,1,5)){}
}
*/

//.........................................patern without semicolon....................................
/*
void main(int a,int b)
{
	if(b=1){}
	while(b<=5)
	{
		if(printf("*  ",a)){}
			if( a==b && printf("\n",b++,a=0)){}
		if(++a);
	}
}*/

//......................................Selction Sort.....................................

/*
void selcSort(int x[],int n)
{
	int min;
	for(int i=0;i<n-1;i++)
	{min=i;
		for(int j=i+1;j<n;j++)
		{
			if(x[min]>x[j])
	min=j;}

			if(min!=i)
			{
			int swap=x[i];
			x[i]=x[min];
			x[min]=swap;
			display(x,n);
			}

	}
}
void main()
{
	int x[]={2,50,7,5,4,8,9,89,};//last ma semicolon hona sa koi problem nahi ha
	int n=8;
	display(x,n);
	selcSort(x,n);
	display(x,n);
}
*/

//............................................addition of n number without + operator..............
/*
void main()
{int n =10;
int sum=0;
	for(int i=1;i<=n;i-=-1)
	{
		sum=sum-(-i);
	}
	printf("total is =>%d",sum);
}
*/

//....................................Pattern using xor(^) operator...........................

/*
void main()
{
	int i,j,n=10;
	for( i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if((i^j)<=3)
			{
				printf("* ");
			}
			else
			{
				printf("  ");
			}
		}
		printf("\n");
	}
}
*/

//.................................................CountSort................................
/*
void main()
{
	int k = 1;
	int a = 0, b = 1, s = 1, n = 9;
	while (s<=n)
	{
		if (k <= n)
		{
			printf("  ");                  //not complete
			k++;
		}
		if (k >= n)
		{
			printf(" *");
			a++;
		}
		if (a == b)
		{
			printf("\n");
			s++;
			s <= 5 ? b++, b++ : b--, b--;
			k = b;
			a = 0;

		}
	}
}
*/

//****************************************LinkedList**************************************
/*
void insertAtB(int);
void insertAtE(int);
void showStart();
void insertAtSp(int x, int posi);
int countNode();
int deleteAtE();
int deleteAtB();
int deleteAtSp(int posi);
struct Node
{
	int data;
	struct Node *next;
};

struct Node *start = NULL;

struct Node *cTemp()
{
	struct Node *temp = malloc(sizeof(struct Node));
	if (temp == NULL)
	{
		printf("NO SPACES\n");
		exit(0);
	}
	return temp;
}

void insertAtB(int x)
{
	struct Node *temp = cTemp();

	temp->data = x;
	temp->next = start;
	start = temp;
}

void showStart()
{
	struct Node *temp = start;
	while (temp != NULL)
	{
		printf("%d \n", temp->data);
		temp = temp->next;
	}
}

void showEnd(struct Node *temp)
{
	if (temp == NULL)
		return;
	showEnd(temp->next);
	printf("%d\n", temp->data);
}

void insertAtE(int x)
{
	if (start == NULL)
	{
		insertAtB(x);
		return;
	}
	struct Node *temp = cTemp();

	temp->data = x;
	temp->next = NULL;
	struct Node *temp1 = start;

	while (temp1->next != NULL)
		temp1 = temp1->next;
	temp1->next = temp;
}

int countNode()
{
	int i = 0;
	struct Node *temp = start;
	while (temp != NULL)
	{
		++i;
		temp = temp->next;
	}
	return i;
}
void insertAtSp(int x, int posi)
{
	if (start == NULL || posi <= 1)
	{
		insertAtB(x);
		return;
	}
	if (posi >= countNode())
	{
		insertAtE(x);
		return;
	}

	struct Node *temp = cTemp();
	temp->data = x;
	struct Node *temp1 = start;
	for (int i = 1; i < posi - 1; i++)
	{
		temp1 = temp1->next;
	}
	temp->next = temp1->next;
	temp1->next = temp;
}
int deleteAtB()
{
	int x = start->data;
	start = start->next;
	return x;
}
int deleteAtE()
{
	if (start->next == NULL)
	{
		return deleteAtB();
	}
	struct Node *temp = start;
	while (temp->next->next != NULL)
	{
		temp = temp->next;
	}
	int x = temp->next->data;
	temp->next = NULL;
	return x;
}

int deleteAtSp(int posi)
{
	if (posi < 1)
	{
		printf("ENTER VALID POSITION\n");
	}
}

void main()
{
	insertAtB(10);
	insertAtB(20);
	insertAtB(30);

	insertAtB(40);
	insertAtB(50);
	insertAtE(100);
	showStart();
	insertAtSp(500, 3);
	showStart();
	printf("********************\n");
	printf("delte begining=%d\n", deleteAtB());
	printf("********************\n");
	showStart();
	printf("********************\n");
	printf("delte begining=%d \n", deleteAtB());
	printf("********************\n");
	insertAtB(1000);

	showStart();
	printf("********************\n");
	printf("delte begining=%d \n", deleteAtB());
	printf("********************\n");
	showStart();
	printf("********************\n");
	printf("delte Ending=%d \n", deleteAtE());
	printf("********************\n");
	showStart();
	printf("********************\n");
	printf("delte Ending=%d \n", deleteAtE());
	printf("********************\n");
	showStart();
	printf("********************\n");
	deleteAtSp(-1);
}
*/

//***************bubble sort*************** */

void main()
{
	int x[] = {5, 4, 6,67,3, 2, 1};
	int n = 7;
	for (int i = n - 2; i >= 0; i--)
	{
		for (int j = 0; j <= i; j++)
		{
			if (x[j] > x[j + 1])
			{
				int t = x[j];
				x[j] = x[j + 1];
				x[j + 1] = t;
			}
		}
	}
	display(x, n);
}