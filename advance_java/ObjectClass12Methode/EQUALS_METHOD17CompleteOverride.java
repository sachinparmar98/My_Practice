class Employe {
    int id;

    String name;

    Employe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) {

            return true;

        }
        if (o instanceof Employe) {

            Employe e = (Employe) o;

            if (id == e.id && name.equals(e.name))

            {

                return true;

            } else

            {

                return false;
            }
        } else {

            return false;
        }
    }
}

class EQUALS_METHOD17CompleteOverride {
    public static void main(String ar[])

    {
        Employe e1 = new Employe(101, "aaa");
        Employe e2 = new Employe(102, "bbb");
        Employe e3 = new Employe(101, "ccc");
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
