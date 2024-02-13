class Employe {

}

class HAS_CODE3 {
    public static void main(String ar[]) {
        Employe e1 = new Employe();
        System.out.println(e1);
        System.out.println(e1.hashCode());
        System.out.println(Integer.toHexString(e1.hashCode()));
        System.out.printf("%x\n", e1.hashCode());
    }
}
// HEAXA DECIMAL NUMBER KO HE hashCode kahta ha
// return type of hashCode() is decimal