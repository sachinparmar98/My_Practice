import java.util.Scanner;
//************************EXAMPLE-1************************
//switch case with for loop 

// class SwitchCase {
//     final static short i = 2;
//     public static int j = 0;

//     public static void main(String ar[]) {
//         for (int k = 0; k <= 3; k++) {
//             switch (k) {
//                 case i:
//                     System.out.println("0");
//                 case i - 1:
//                     System.out.println("1");
//                 case i - 2:
//                     System.out.println("2");
//                 case i - 3:
//                     System.out.println("3");
//             }
//         }
//     }

// }

// ************************EXAMPLE-2************************
class SwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yout marks");
        int marks = sc.nextInt();

        switch (marks / 10) {
            case 10:
            case 8:
            case 9:
                System.out.println("Excellent");
                break;
            case 7:
                System.out.println("Very Good");
                break;
            case 6:
                System.out.println("Good");
                break;
            case 5:
                System.out.println(" Work Hard ");
                break;
            case 4:
                System.out.println("Poor");
                break;
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Very Poor");
                break;
            default:
                System.out.println("Invalid value Entered");
        }
    }
}
// ************************EXAMPLE-3************************
// ************************EXAMPLE-4************************
// ************************EXAMPLE-5************************
// ************************EXAMPLE-6************************
// ************************EXAMPLE-7************************
// ************************EXAMPLE-8************************
// ************************EXAMPLE-9************************
