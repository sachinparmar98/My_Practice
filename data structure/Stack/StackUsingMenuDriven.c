#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#define CAPACITY 5
void push(int n);
void pop();
void peek();
bool isEmpty();
int top=-1;
int stack[CAPACITY];
void main()
{
int op,x;
M:
	printf("............MENU............\n");
	printf("      Enter you choice\n\n");
	printf("   1=> Insert Data\n");
	printf("   2 => Display top Data\n");
	printf("   3 => Display top Data And  Then Delete\n");
	printf("   4 => Check Stack is Empty or Filled\n");
	printf("   5 => Exit\n");
	scanf("%d",&op);
	
	switch(op)
	{
	case 1:
    
	 printf("enter element\n");
scanf("%d",&x);
push(x);
goto M;
case 2:
  peek();	
goto M; 
case 3:
  pop();	
goto M; 
case 4:
  printf("%s\n",isEmpty()?"stack is Empty":"stack is Not Empty");	
goto M; 
case 5:
exit(0);
default:
printf("invlid choice\n");
	goto M;}
}
void push(int x)
{
if(top==CAPACITY-1)
{
printf("stack is full\n");
      return;
}
stack[++top]=x;
}
void pop()  
{
if(isEmpty()) printf("stack is Empty\n");

else printf("%d\n",stack[top--]);

}
void peek()
{
if(isEmpty()) printf("stack is Empty\n");
else  printf("%d\n",stack[top]);
}
bool isEmpty()
{
 if(top==-1)
 return true;
 return false;
}