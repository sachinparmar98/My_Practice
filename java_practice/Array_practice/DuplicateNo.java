class DuplicateNo {

    public static void main(String[] args) {
        int x[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12, 12, 13, 14, 15, 16, 7, 18, 10, 4, 21, 22, 23, 22, 45, 45, 12,
                67,
                6, 55, 43, 11, 23, 15 };
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[j] == x[i]) {
                    // System.out.println("duplicate no. is=" + x[i]);
                    count++;
                }
            }
            if (count != 0) {
                System.out.println("reptattion of no.   " + x[i] + "   is =" + count);
                count = 0;
            }
        }
    }
}
