public class CountOddNumberInAnIntervalRange {
    public static void main(String[] args) {

    }

    // this code is not optimize see below code
    public int countOdds(int low, int high) {
        if (low == high) {
            if (low % 2 != 0)
                return 1;
            return 0;
        }
        int count = 0;
        if (high - low > 1) {
            if (low % 2 == 1) {
                count++;
                low++;
            }
            if (high % 2 == 1) {
                count++;
                high--;
            }
            return count + (high - low) / 2;
        } else {
            if (low % 2 == 1)
                count++;
            if (high % 2 == 1)
                count++;
            return count;
        }

    }
    // eassy code

    public int countOdds2(int low, int high) {
        {
            return (high + 1) / 2 - low / 2;
        }

    }

}
// easy form return (high+1)2-low/2;
/*
 * beacuse odd number betwen 1 to n if n is odd =>(n+1)/2
 * even number berenw 1 to n if n is even => n/2
 */