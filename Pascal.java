//First name : Sumana. Last Name: Bangalore Ashok
// Section : CS 505852
// Student ID : 31536751
// Project 5 : Pascal's Triangle

class Pascal {

	public static int[] triangle(int n) {

		int[] current_line = new int[n];

		if (n == 1 || n == 0) {
			current_line[0] = 1;
			return current_line;
		}

		int[] prev_line = triangle(n - 1);

		current_line[0] = 1;
		current_line[n - 1] = 1;

		for (int i = 1; i < prev_line.length; i++) {

			current_line[i] = prev_line[i - 1] + prev_line[i];
		}

		return current_line;
	}
}
