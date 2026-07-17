package Math;

public class number_of_steps_to_reduce_a_number_to_zero {
    public static void main(String[] args) {
      System.out.println(numberOfSteps(3));

    }

    public static int numberOfSteps(int num) {

        if (num == 0)
            return 0;
        if (num % 2 == 0) {
            return 1 + numberOfSteps(num / 2);
        } else {
            return 1 + numberOfSteps(num - 1);
        }
    }
}
