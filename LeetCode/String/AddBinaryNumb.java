package String;

public class AddBinaryNumb {
    public static void main(String[] args) {

    }

    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int al = a.length();
        int bl = b.length();
        int carry = 0;

        while (al >= 0 || bl >= 0 || carry == 1) {
            if (al >= 0)
                carry += a.charAt(al--) - '0';// a.charA()=0 the 0 ascii 48 soo 48-48 it store 0

            if (bl >= 0)
                carry += b.charAt(bl--) - '0';

            ans.append(carry % 2);
            carry /= 2;
        }
        return ans.reverse().toString();
        // we use toString() method for convert StringBuilder into String because our
        // return type is String

    }

}
