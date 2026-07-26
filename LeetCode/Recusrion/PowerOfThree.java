public class PowerOfThree {

    class Solution {
        boolean b;

        public boolean isPowerOfThree(int n) {
            if (n % 2 == 0)
                return b = false;

            if (n == 1)
                b = true;
            if (n % 3 == 0) {
                isPowerOfThree(n / 3);
            }
            return b;

            // single run program
            // retrun n>0 &&1162261467%n==0; //this will work
            // why we not write n>1 becasue 1 is power of every positive number
        }
    }

}
