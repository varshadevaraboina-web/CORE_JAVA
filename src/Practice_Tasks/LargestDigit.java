package Practice_Tasks;

public class LargestDigit {
	public static void main(String[] args) {

		int num = 5832;
		int n=5832;
		int largest = 0;

		while (num != 0) {

			int digit = num % 10;

			if (digit > largest) {
				largest = digit;
			}

			num = num / 10;
		}
		System.out.println("The digits are:"+" "+n);
		System.out.println("Largest digit = " + largest);

	}

}
