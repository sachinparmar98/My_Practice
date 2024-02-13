class Employe {
    int id;
    String add;

    Employe(int id, String add) {
        this.id = id;
        this.add = add;
    }

    void show() {
        System.out.println("id=" + id);
        System.out.println("add=" + add);

    }
}

class initilizeWithConstructor {
    public static void main(String ar[]) {
        Employe ram = new Employe(101, "indore");
        Employe sita = new Employe(102, "bhopal");
        ram.show();
        sita.show();

    }
}