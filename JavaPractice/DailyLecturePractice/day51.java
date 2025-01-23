import java.io.*;

class StoreData {
    public static void main(String[] args) throws Exception {
        String s1 = "my name is shree sitaram";
        FileOutputStream fi = new FileOutputStream("abc.txt");
        int i = 0;
        while (i < s1.length()) {

            fi.write(s1.charAt(i));
            i++;
        }
        fi.close();

    }
}

class Ram {
    public static void main(String[] args) {
        System.out.println("ram ji ji ji");
    }
}

// NEW PROGRAM
class parent {
    parent(int a, int b) {
        this(a);
        System.out.println("double parmetrized constructor");

    }

    parent(int a) {
        this();
        System.out.println("single parmeterized  constructor");
    }

    parent() {
        System.out.println("non argument constructor");
    }

}

class ParentCheck {
    public static void main(String[] args) {
        parent p = new parent();
        int i, j;
        for (i = 1, j = 1; i <= 10; i++, j++)

        {
            System.out.println(i * j);
        }
    }
}