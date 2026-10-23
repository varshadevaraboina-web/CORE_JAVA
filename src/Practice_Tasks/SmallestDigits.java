package Practice_Tasks;

public class SmallestDigits {

	public static void main(String[] args) {

		int num = 5832;
		int n = 5832;
		int smallest = 9;

		while (num != 0) {

			int digit = num % 10;

			if (digit < smallest) {
				smallest = digit;
			}

			num = num / 10;
		}
		System.out.println("The digits are:"+" "+n);
		System.out.println("Smallest digit = " + smallest);
	}

}
