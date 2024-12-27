/* 
class day50 {
	public static void main(String ar[]) {
		int n = 15;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j <= n / 2 + 2 || i + j >= n / 2 + n + 2 || (j - i >= n / 2) || i - j >= n / 2) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}
}
*/

class day50 {
	public static void main(String ar[]) {
		int n = 25;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i + j >= n / 2 + 2 && j - i <= n / 2 && i <= n / 2 + 1) || j == n / 2 + 1 || i == n
						|| (i + j <= n + 1 && i >= n / 2 + 1) || (j - i >= 0 && i >= n / 2 + 1)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}
}