class Employe {
    int id;
    String name;

    void get(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println("id=" + id);
        System.out.println("name=" + name);
    }
}

class initilizeWithMethod {
    public static void main(String ar[]) {
        Employe ram = new Employe();
        Employe sita = new Employe();
        ram.get(101, "indore");
        sita.get(102, "bhopal");
        ram.show();
        sita.show();

    }
}