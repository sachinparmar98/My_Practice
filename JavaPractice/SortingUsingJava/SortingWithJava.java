// ***********SELECTION SORT********** */

// class SortingWithJava {
// static void sort(int x[], int n) {
// for (int i = 0; i < n - 1; i++) {
// for (int j = i; j < n; j++)

// if (x[i] > x[j])

// x[j] = (x[i] + x[j]) - ((x[i] = x[j]));
// // commented code will also worked
// /*
// * if (x[i] > x[j]) {
// * x[i] = x[i] ^ x[j];
// * x[j] = x[i] ^ x[j];
// * x[i] = x[i] ^ x[j];
// * }
// */

// }
// }

// public static void main(String ar[]) {
// int n = 10;
// int x[] = { 10, 1, -9, 56, 32, 400, 7, 260, 20, -99 };
// sort(x, n);
// for (int i : x)
// System.out.print(i + " ");
// }
// }

// ***********INSERTION SORT******************* */

// class SortingWithJava {
// public static void insertionSort(int[] data) {
// for (int i = 1; i < data.length; i++) {
// int key = data[i];
// int j = i - 1;
// while (j >= 0 && key < data[j]) {
// data[j + 1] = data[j];
// j--;
// }
// data[j + 1] = key;
// }
// }

// public static void main(String... sachin) {
// int x[] = { 2, 4, 5, 7, 9, 6, 1, 2, 345, 67, 678 };
// insertionSort(x);
// for (int n : x)
// System.out.print(" " + n);
// }

// }

// ***********MERGE SORT*********** */

// class SortingWithJava {
//     static void divide(int x[], int n) {
//         if (n <= 1)
//             return;
//         int l = n / 2;
//         int r = n - l;
//         int Left[] = new int[l];
//         int Right[] = new int[r];
//         for (int i = 0; i < l; i++)
//             Left[i] = x[i];
//         for (int j = 0; j < r; j++)
//             Right[j] = x[l + j];

//         divide(Left, l);
//         divide(Right, r);
//         merge(Left, Right, x, l, r);
//     }

//     static void merge(int Left[], int Right[], int x[], int l, int r) {
//         int i, j, k = 0;
//         for (i = 0, j = 0; i < l && j < r;) {
//             if (Left[i] < Right[j])
//                 x[k++] = Left[i++];
//             else
//                 x[k++] = Right[j++];
//         }
//         while (i < l)
//             x[k++] = Left[i++];
//         while (j < r)
//             x[k++] = Right[j++];
//     }

//     public static void main(String ar[]) {
//         int n = 10;
//         int x[] = { 5, 67, 304, 309, 12, -4, 0, 100, -30, 12 };
//         divide(x, n);
//         for (int i : x)
//             System.out.print(i + "  ");
//     }
// }