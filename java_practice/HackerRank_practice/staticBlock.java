import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    static int H;
    static int B;
    static boolean flag = false;
    static {
        Scanner s = new Scanner(System.in);
        H = s.nextInt();
        B = s.nextInt();
        if (H <= 0 || B <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {

            flag = true;
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}// end of class
