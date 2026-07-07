import java.util.Stack;

class ReverseStack {// Approach-2 (Using O(1) Auxiliary Space)
                    // Simply write a story like recursion and trust it
                    // Time : O(n^2)
                    // Space : O(1) Auxiliary Space
    public static void main(String ar[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 5; i++)
            s.push(i);
        System.out.println(s);
        rev(s);
        System.out.print(s);

    }

    static void rev(Stack<Integer> s) {
        if (s.empty())
            return;
        int top = s.peek();
        s.pop();
        rev(s);
        insertBottom(s, top);
    }

    static void insertBottom(Stack<Integer> s, int element) {
        if (s.empty()) {
            s.push(element);
            return;
        }
        int current_top_elemet = s.peek();

        s.pop();
        insertBottom(s, element);
        s.push(current_top_elemet);

    }
}