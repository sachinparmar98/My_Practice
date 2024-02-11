public class A {
    public String toString() {
        return "ram";
    }
}

public class If2PublicClassInFile {
    public static void main(String ar[]) {
        A a1 = new A();
        System.out.println(a1);
        System.out.println(a1.toString());
    }
}
/*
 * error: reached end of file while parsing
 * If2PublicClassInFile
 * ^
 * 
 * 
 * 
 * solution == dono ko public declare nhi ker sakta ha
 */