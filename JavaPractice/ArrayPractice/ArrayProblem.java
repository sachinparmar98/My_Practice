import java.time.*;
import java.util.Random;
// ***************FIND DUPLICATE NUMBER IN ARRAY************* */

// class ArrayProblem {
// public static void main(String[] args) {
// int x[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12, 12, 13, 14, 15,
// 16, 7, 18, 10, 4, 21, 22, 23, 22, 45, 45, 12, 2, 2, 2, 2, 2, 2, 2, 2, 67, 6,
// 55, 43, 11, 23, 15 };
// int count = 0;
// for (int i = 0; i < x.length; i++) {
// for (int j = i + 1; j < x.length; j++) {
// if (x[j] == x[i]) {
// // System.out.println("duplicate no. is=" + x[i]);
// count++;
// }
// }
// if (count != 0) {
// System.out.println("reptattion of no. " + x[i] + " is =" + count);
// count = 0;
// }
// }
// }
// }

// *********FIND MISSING NUMBER IN ARRAY************* */

// class ArrayProblem {
// public static void main(String[] args) {
// int x[] = { 1, 3, 6, 2, 7, 5, 9, 8, 10 };
// int min = x[0];
// int sum1 = 0;
// int sum2 = 0;
// int limit = 1;
// for (int i = 0; i < x.length; i++) {
// if (min > x[i] && limit == 1) {
// min = x[i];
// }
// if (i == x.length - 1 && sum2 == 0) {
// i = -1;
// limit = 0;
// }
// if (limit == 0 && i >= 0) {
// sum1 = sum1 + x[i];
// sum2 = sum2 + min;
// min++;
// }
// }
// System.out.println("missing no. is=" + ((sum2 + min) - sum1));
// }

// }

// *******FIND TARGET ELMENT INDEX (LINEAR SEARCH)************ */

// class ArrayProblem {
// static int findIndex(int x[], int target) {
// long start = System.currentTimeMilles();
// for (int i = 0; i < x.length; i++)
// if (target == x[i])
// return i;
// long timeTake = System.currentTimeMilles() - start;
// System.out.println(timeTake);
// return -1;
// }

// public static void main(String[] args) {
// int x[] = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };
// System.out.println("Targer index=" + findIndex(x, 2));
// }
// }

// ***********GENRATE RANDOM NUMBER AND STORE IN ARRAY*********** */

// class ArrayProblem {
// public static void insertRandom(int x[])
// // Random class is stored inside util package
// {
// Random num = new Random();
// for (int i = 0; i < x.length; i++)
// x[i] = num.nextInt(10);
// // x[i] = num.nextInt();
// // x[i] = num.nextDouble();
// // x[i] = num.nextGaussian();
// }

// public static void main(String... a) {
// int x[] = new int[10];
// insertRandom(x);
// for (int n : x)
// System.out.print(" " + n);
// }

// }

/*********** BINARY SEARCH************* */

// class ArrayProblem {
// public static int binarySearch(int x[], int target) {
// // binary search is O(logn) algorithm
// int mid;
// int left = 0;
// int right = x.length - 1;
// while (left <= right) {
// mid = (left + right) / 2;
// if (x[mid] == target)
// return mid;
// else if (target < x[mid])
// right = mid - 1;
// else
// left = mid + 1;

// }
// return -1;
// }

// public static void main(String[] args) {
// int x[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 25, 69 };
// System.out.println("indext of target=" + binarySearch(x, 11));
// }
// }

// ************************ */