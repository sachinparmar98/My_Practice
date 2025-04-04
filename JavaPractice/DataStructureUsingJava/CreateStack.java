
//.................EXAMPLE -1....................
/* we will create Primitive type stack*/
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

interface intStack {
  boolean isEmpty();

  void push(int x);

  int pop();

  int peek();

  int size();

}

/*
 * One of the main purposes of an interface like IntStack is to use the type to
 * declare variables. The declaration
 * IntStack s;
 */

/*
 * Programming to Interfaces
 * In general, try to declare variables with interface types rather than class
 * types.
 * This technique, known as programming to the interface, allows greater
 * flexibility because it does not tie your code down to particular
 * implementations. If you declare variables with interface types, then changing
 * to a new
 * implementation for that variable reference is usually just a matter of
 * calling
 * a different constructor, such as:
 * IntStack s = new IntLinkedStack();
 * No subsequent code using s should have to change because it is already using
 * the interface
 */

// class intArrayStack implements intStack {
// private int top = -1;
// private int[] data;
// private static final int DEFAULT_CAPACITY = 10;

// public intArrayStack() {
// data = new int[DEFAULT_CAPACITY];
// }

// public void push(int item) {
// if (top == data.length - 1)
// resize(2 * data.length);
// data[++top] = item;
// }

// private void resize(int newSize) {
// int index = 0;
// int[] newdata = new int[newSize];
// for (int i : data) {
// newdata[index++] = i;
// }
// data = newdata;

// }

// public int size() {

// return top;

// }

// public int peek() {
// if (isEmpty()) {
// throw new NoSuchElementException();
// }
// return data[top];
// }

// public int pop() {
// if (isEmpty()) {
// throw new EmptyStackException();
// }
// return data[top--];
// }

// public boolean isEmpty() {
// if (top == -1)
// return true;
// return false;
// }

// }

// public class CreateStack {
// public static void main(String[] args) {

// intStack s = new intArrayStack();
// s.push(10);
// s.push(20);
// s.push(30);
// s.push(40);
// s.push(50);
// System.out.println(s.peek());
// System.out.println(s.pop());
// System.out.println(s.peek());
// System.out.println(s.isEmpty());
// System.out.println(s.pop());
// s.pop();
// s.pop();
// s.pop();
// System.out.println(s.isEmpty());
// System.out.println(s.size());

// }
// }

// ..............EXAMPLE-2..................
// WE WILL CREATE LINKED LIST TYPE STACK
