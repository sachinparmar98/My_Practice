/*
 * Nodes
A Node class is used to represent the nodes that link together to form linked
lists. A typical Node class has only its two fields, data and next, and a
constructor,


Nested Classes
Because code outside the IntLinkedStack class has no reason to know about
nodes, the Node class is defined inside the body of IntLinkedStack. That
makes the Node class a nested class of IntLinkedStack. Nested classes are
considered members of their containing class, just like fields and methods.
Usually, nested classes are also declared private because they are implementation
 details of the containing class, similar to fields. Nested classes are always
visible to their containing class (and vice versa), even when declared private.


A static nested class has no access to the instance variables of the containing
class. In Listing 3.4, the only instance variable of the stack is top, and there
is no reason for every node to have access to the top of the stack. Most of
our linked structures will use static nested node classes, but we will see an
example of a non-static nested class
 */

//...................STEP-1...................
class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

// ....................STEP-2................

class MyLinkedList {
    private Node top;

    public void insert(int item) {
        top = new Node(item, top);
    }

    private class Node {
        private int data;
        private Node next;

        Private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }
}

class CreateLinkedList {
    public static void main(String[] args) {
        MyLinkedList L = new MyLinkedList();
        for (int i = 1; i <= 5; i++) {
            L.insert(i * 10);
        }

    }
}