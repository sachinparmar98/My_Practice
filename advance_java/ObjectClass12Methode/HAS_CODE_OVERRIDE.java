class Employe {

    public int hashCode() {
        return 100;
    }
}

class HAS_CODE_OVERRIDE {
    public static void main(String ar[]) {
        Employe e1 = new Employe();
        Employe e2 = new Employe();
        System.out.println(e1);
        System.out.println(e2);
    }
}
// HEAXA DECIMAL NUMBER KO HE hashCode kahta ha
// return type of hashCode() is decimal
// Object class ki toString call hui ha
/*
 * output=
 * Employe@64
 * Employe@64
 */