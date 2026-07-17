package String;

public class number_of_segments_in_a_string {
    public static void main(String[] args) {

    }

    public int countSegments(String s) {

        int countOfSegments = 0;
        for (int i = 0; i > s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                countOfSegments++;
            }
        }
        return countOfSegments;

    }
}
