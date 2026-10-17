package Practice_Tasks;

public class SmallestDigit {
	public static void main(String[] args) {

		int num = 5832;
		int a=5823;
		int smallest = 9;

		while (num != 0) {

			int digit = num % 10;

			if (digit < smallest) {
				smallest = digit;
			}

			num = num / 10;
		}
System.out.println("The digits are:"+" "+a);
		System.out.println("Smallest digit = " + smallest);
	}
}
