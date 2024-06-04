#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
void showAll();
void insertAtB(int );
int  palindrome(int );
struct Node
{
	int x;
	struct Node *next;
};
struct Node *start = NULL;

void main()
{
insertAtB(10);
insertAtB(20);
insertAtB(33);
insertAtB(40);
showAll();
struct Node *temp=start;
while (temp!=NULL)
{
	if(palindrome(temp->x))
	{
		printf("%d is palindrom\n",temp->x);
	}
	else
		printf("%d is not  palindrom\n",temp->x);
		temp=temp->next;
}
}

void showAll()
{
	struct Node *temp = start;
	printf("Data Of LinkedList Is Below\n");
	while (temp != NULL)
	{
		printf("%d\n", temp->x);
		temp = temp->next;
	}
}

void insertAtB(int x)
{

	struct Node *temp = malloc(sizeof(struct Node));
	if (temp == NULL)
	{
		printf("no memory avilable");
		return;
	}
	int n;
	printf("enter value for insert data\n");
	scanf(" %d", &n);

	temp->x = n;

	temp->next = start;
	start = temp;
	printf("DATA INSERTED\n");
}
int palindrome(int n)
{  
    
       
       int n1=n;
  	int s=0;
	while(n1!=0)
	{
		s=s*10+n1%10;
		n1=n1/10;
	}
	return n==s; 
}