// interface Inter3 {
//     void show(); //internaly abstract public void show();
// }

// class A implements Inter3 {

// }

// class I3 {
//     public static void main(String[] args) {

//     }
// }
//******error-(for I3) A is not abstract and does not override abstract method show() in Inter3

//*******I3Solution//
// interface Inter3 {
//     void show();
// }

// class A implements Inter3 {
//     void show() {
//         System.out.println("class A show method ");
//     }
// }

// class I3Solution {
//     public static void main(String[] args) {
//         A a = new A();
//         a.show();
//     }
// }

//*******ERROR(for I3Solution) - attempting to assign weaker access privileges; was public

interface Inter3 {
    void show();
}

class A implements Inter3 {
    public void show() {
        System.out.println("class A show method1212 ");
    }
}

class I3SolutionS {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}
