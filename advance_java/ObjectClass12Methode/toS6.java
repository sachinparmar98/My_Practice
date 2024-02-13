class Employe {
    int id;
    String add;

    Employe(int id, String add) {
        this.id = id;
        this.add = add;
    }

    public String toString() {
        return "id=" + id + "\t add=" + add;
    }
}

class toS6 {
    public static void main(String ar[]) {
        Employe ram = new Employe(101, "indore");
        Employe sita = new Employe(102, "bhopal");
        System.out.println(ram);
        System.out.println(sita);
    }
}
