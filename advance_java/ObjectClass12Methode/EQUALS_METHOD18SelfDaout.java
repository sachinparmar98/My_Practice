class Employe {
    int id;

    String name;

    Employe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) {
            System.out.println("this block");
            return true;

        }
        if (o instanceof Employe) {
            System.out.println("instanceof");
            Employe e = (Employe) o;
            System.out.println("type casting");
            if (id == e.id && name.equals(e.name))

            {
                System.out.println("id== code exexcute");
                return true;

            } else

            {
                System.out.println("id ==code else execute");
                return false;
            }
        } else {
            System.out.println("istancceof else execute");
            return false;
        }
    }
}

class EQUALS_METHOD18SelfDaout {
    public static void main(String ar[])

    {
        Employe e1 = new Employe(101, "aaa");
        Employe e2 = new Employe(102, "bbb");
        Employe e3 = new Employe(101, "ccc");
        Employe e4 = e1;

        // System.out.println(e1 == e2);
        // System.out.println(e1 == e3);
        // System.out.println(e1 == e4);

        // System.out.println(e1.equals(e2));
        // System.out.println(e1.equals(e3));
        // System.out.println(e1.equals(e4));

        System.out.println(e1.equals("aaa"));
        // System.out.println(e1.equals(101));
        // System.out.println(e1.equals(null));

    }
}
