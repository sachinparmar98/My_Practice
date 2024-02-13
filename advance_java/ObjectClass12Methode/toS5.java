class Employe {
    int id;
    String add;

    Employe(int id, String add) {
        this.id = id;
        this.add = add;
    }
}

class toS5 {
    public static void main(String ar[]) {
        Employe ram = new Employe(101, "indore");
        Employe sita = new Employe(102, "bhopal");
        System.out.println(ram);
        System.out.println(sita);
    }
}
