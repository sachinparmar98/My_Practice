
/*
 * E1 print alphabet
 * E2 Java program to print Floyd’s triangle
 */
import java.util.Scanner;

/****************** E1********************* */
// for print alphabet
// class DiffrentProgram {
//     public static void main(String ar[]) {
//         char c, C;
//         for (c = 'a', C = 'A'; c <= 'z' && C <= 'Z'; c++, C++) {
//             System.out.println(c + " " + C);
//         }
//     }
// }
/****************** E2****************** */
// Java program to print Floyd’s triangle
class DiffrentProgram {
    public static void main(String... a) {
        int num = 1, i = 1, j = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row for floyids triangle");
        byte n = sc.nextByte();
        while (i <= n) {
            System.out.print(num++ + " ");
            if (i == j) {
                System.out.println();
                i++;
                j = 0;
            }
            j++;
        }

    }
}

/****************** E3********************* */
/****************** E4********************* */
/****************** E5********************* */
/****************** E6********************* */
/****************** E7********************* */
/****************** E8********************* */
/****************** E9********************* */
/****************** E10********************* */
