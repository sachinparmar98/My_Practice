class MissingNo {
    public static void main(String[] args) {
        int x[] = { 1, 3, 6, 2, 7, 5, 9, 8, 10 };
        int min = x[0];
        int sum1 = 0;
        int sum2 = 0;
        int limit = 1;
        for (int i = 0; i < x.length; i++) {
            if (min > x[i] && limit == 1) {
                min = x[i];
            }
            if (i == x.length - 1 && sum2 == 0) {
                i = -1;
                limit = 0;
            }
            if (limit == 0 && i >= 0) {
                sum1 = sum1 + x[i];
                sum2 = sum2 + min;
                min++;
            }
        }
        System.out.println("missing no. is=" + ((sum2 + min) - sum1));
    }

}
