#include<stdio.h>
#include<stdlib.h>
void showAll();
void insertAtB(int,char);
void insertAtE(int,char);
struct Node
{
int data ;
char gender;
struct Node *next;
};
struct Node *start=NULL;
void main()
{
insertAtE(10,'M');
insertAtE(20,'F');
insertAtE(30,'M');
insertAtE(40,'M');
insertAtE(50,'M');
showAll();
}
void insertAtB(int x,char name)
{
struct Node *temp=malloc(sizeof(struct Node));
if(temp==NULL)
{
printf("no memory avilable");
return;
}
  temp->data=x;
  temp->gender=name;
  temp->next=start;
  start=temp;
}
void insertAtE(int x,char name)
{
struct Node *temp=malloc(sizeof(struct Node));
if(start==NULL)
{
insertAtB(x,name);
return;
}

temp->data=x;
temp->gender=name;
temp->next=NULL;
struct Node *temp1=start;
while(temp1->next!=NULL)
{temp1=temp1->next;}

temp1->next=temp;
  }
 void showAll()
  {
	  struct Node *temp=start;
	  while(temp!=NULL)
	  {
		  printf("%d\t%c\n",temp->data ,temp->gender);
		  temp=temp->next;
	  }
  }

