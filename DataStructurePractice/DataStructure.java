class DataStructure {
    public static void main(String ar[]) {
        int n = 25;
        boolean b[] = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (b[i] == false) {
                for (int j = i + i; j <= n; j = j + i) {
                    b[j] = true;
                }
            }
        }
        for (int i = 2; i < 25; i++) {
            if (!b[i])
                System.out.println(i);
        }
    }
}