public class UglyNumber {
    public static void main(String[] args) {

    }https://leetcode.com/problems/number_of_segments_in_a_string

    // we can solve with loop but we will solve it without loop
    public static boolean isUgly(int n) {
        if (n < 1)
            return false;
        int maxPowerOf2 = 1_073_741_824;// 2^30
        int maxPowerOf3 = 1_162_261_467;// 3^19
        int maxPowerOf5 = 1_220_703_125;// 5^13
        long univerhalUglyDividend = maxPowerOf2 * maxPowerOf3 * maxPowerOf5;//means is num ki divide kerna per remainder 0 ayaa to number ugly ha 
        return univerhalUglyDividend % n == 0;
    }

}
