// Object class toString methode is public 
class Employe {
    String toString() {
        return "ram";
    }
}

class toS3 {
    public static void main(String ar[]) {
        Employe e1 = new Employe();
        System.out.println(e1);
        System.out.println(e1.toString());
    }

}
/*
 * error: toString() in Employe cannot override toString() in Object
 * String toString() {
 * ^
 * attempting to assign weaker access privileges; was public
 */