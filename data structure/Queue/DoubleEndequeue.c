#include <stdio.h>
#include <stdlib.h>
#define CAPACITY 5 

int deque[CAPACITY];
int front = -1;
int rear = -1;

int isFull() {
    return ((front == 0 && rear ==CAPACITY - 1) || (front == rear + 1));
}

int isEmpty() {
    return (front == -1);
}

void insertAtB(int x) {
    if (isFull()) {
        printf("que is full.\n");
        return;
    }

    if (front == -1) { 
        front = 0;
        rear = 0;
    } else if (front == 0) {
        front = CAPACITY - 1; 
    } else {
        front = front - 1;
    }

    deque[front] = x;
    
}


void insertAtE(int x) {
    if (isFull()) {
        printf("que is full.\n");
        return;
    }

    if (rear == -1) {  
        front = 0;
        rear = 0;
    } 
	else if (rear == CAPACITY - 1) {
        rear = 0; 
    } else {
        rear = rear + 1;
    }

    deque[rear] = x;
    
}

int deleteAtB() {
    if (isEmpty()) {
        printf("que is empty.\n");
        return;
    }

    int removed = deque[front];

    if (front == rear) { 
        front = -1;
        rear = -1;
    } else if (front ==CAPACITY - 1) {
        front = 0;  
    } else {
        front = front + 1;
    }
	return removed;
}
int deleteAtE() {
    if (isEmpty()) {
        printf("que is empty.\n");
        return;
    }

    int removed = deque[rear];

    if (front == rear) { 
        front = -1;
        rear = -1;
    } else if (rear == 0) {
        rear = CAPACITY - 1;      } else {
        rear = rear - 1;
    }
	return removed;
}

void showAll() {
    if (isEmpty()) {
        printf("que is empty.\n");
        return;
    }
int i = front;
    while (1) {
        printf("%d ", deque[i]);
        if (i == rear)
            break;
        i = (i + 1) % CAPACITY;
    }
    printf("\n");
}
void main() {
    insertAtE(5);
    showAll();

    insertAtB(25);
    showAll();
  
  printf("%d\n" ,deleteAtB());
  showAll();
  

    
}
