//import java.math.*;

// class BigIntegerClass{
//     public static void main(String ar[]) {
//         BigInteger fact = BigInteger.valueOf(1);

//         for (int i = 1; i <= 21; i++) {

//             BigInteger k = BigInteger.valueOf(i);
//             fact = fact.multiply(k);
//         }

//         System.out.println(fact);
//     }
// }
import java.io.*;
import java.util.*;
import java.text.*;
import java.util.regex.*;

public class BigIntegerClass {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        BigInteger a = new BigInteger(s.next());
        BigInteger b = new BigInteger(s.next());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
