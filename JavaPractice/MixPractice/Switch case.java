class Demo {
    final static short i = 2;
    public static int j = 0;

    public static void main(String ar[]) {
        for (int k = 0; k <= 3; k++) {
            switch (k) {
                case i:
                    System.out.println("0");
                case i - 1:
                    System.out.println("1");
                case i - 2:
                    System.out.println("2");
                case i - 3:
                    System.out.println("3");
            }
        }
    }

}