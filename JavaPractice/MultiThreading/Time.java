
class Time {
    public static void main(String[] args) {
        for (int i = 1; i <= 500000; i++) {
            if (i % 2 == 0)
                System.out.println("*******************");
            else if (i % 3 == 0)
                System.out.println(">>>>>>>>>>>>>>>>>>>>");
            else if (i % 5 == 0)

            {
                int a = 1, b1 = 1;
                while (b1 <= 5) {
                    System.out.print(a);
                    if (b1 <= a) {
                        System.out.println();
                        b1 += 1;
                        a = 0;
                    }
                    a++;

                }
            } else
                System.out.println(i * i / i);

            try {
                Thread.sleep(200);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}