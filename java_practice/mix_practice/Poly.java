/* 
class Animal {
    void move() {
        System.out.println("animal can move");
    }

}

class Dog extends Animal {
    void move() {

        System.out.println("dog can bark");
    }
}

class Polymorphism {
    public static void main(String ar[]) {
        Animal a1 = new Animal();
        Animal b1 = new Dog();
        a1.move();
        b1.move();
    }
}
*/
class A {
    public void show() {
        System.out.println("class A");

    }

    class B extends A {
        public void show() {
            System.out.println("class B");

        }
    }
}

class Poly {
    public static void main(String ar[]) {
        B b1 = new B();
        b1.show();
    }
}