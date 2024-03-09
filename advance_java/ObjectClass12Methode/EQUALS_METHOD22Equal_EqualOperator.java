class Employe {
    int id;

    String name;

    Employe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
       return (this==o);
    }
}

class EQUALS_METHOD22Equal_EqualOperator {
    public static void main(String ar[])

    {
        Employe e1 = new Employe(101, "aaa");
        Employe e2 = new Employe(102, "bbb");
        Employe e3 = new Employe(101, "aaa");
        Employe e4 = e1;

        System.out.println(e1 == e2);
        System.out.println(e1 == e3);
        System.out.println(e1 == e4);

        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e4));

        System.out.println(e1.equals("aaa"));
        System.out.println(e1.equals(101));
        System.out.println(e1.equals(null));

    }
}
