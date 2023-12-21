class EH1 {
    public static void main(String ar[]) {
        int age = Integer.parseInt(ar[0]);
        if (age < 18) {
            InvalidAgeException iae = new InvalidAgeException("invlaid age is="+age);
            throw iae;
        } else {
            System.out.println("welcome");
        }
    }
}