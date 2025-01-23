
//.................EXAMPLE -1....................
/* we will create Primitive type stack*/
import java.util.EmptyStackException;

public interface intStack {
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

class intArrayStack implements intStack {

  public int size() {

  }

  public boolean isEmpty() {

  }

  public int pop() {

  }

  public void push(int data) {

  }

  public int peek() {

  }
}
