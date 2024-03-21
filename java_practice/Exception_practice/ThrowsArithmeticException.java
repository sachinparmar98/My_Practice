class demo {
	public static void main(String... args) {
		System.out.println("swt1");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			e = new ArithmeticException();
			System.out.println(e.getMessage());

		}
		System.out.println("swt4");

	}

}