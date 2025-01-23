#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#define CAPACITY 30
void push(char);
char peek();
char pop();
int pri(char );
bool isEmpty();
char stack[CAPACITY];
int top=-1;
void main()
{
	char input[CAPACITY];
	char output[CAPACITY];
	int i=0,k=0;
	printf("enter any expresion\n");
	scanf("%s",input);
printf("%s\n",input);
	while(input!='\0')
	{
		if(input[i]=='(') push(input[i]);
		
		else if(input[i]>='A' && input[i]<='Z')  output[k++]=input[i];
		
		else if(')')
		{
			while(peek()!='(')
			{
				output[k++]=pop();
			}
			pop();
                                                			
	}
	
	else
	{
		while(pri(input[i])<=pri(peek()))
		{
			output[k++]=pop();
		}
		push(input[i]);
	}
	i++;
	}
	
	
	output[k++]='\0';
	printf("%s",output);
}
void push(char x)
{
stack[++top]=x;	
}
char pop()
{
	
	return stack[top--];
}
char peek()
{
	
	return stack[top];
}


bool isEmpty()
{
	if(top==-1)return true;
	return false;
}
int pri(char x)
{
	switch(x)
	{
		case '(':return 0;
		case '+':
		case '-':return 1;
		case '*':
		case '/':return 2;
		case '^':return 3;
	}
}