package Practice_Tasks;

public class Array_Largest_Number {

	public static void main(String[] args) {

		int[] a = { 4, 5, 7, 1, 3 };
		int k = 3;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println(k + "rd largest element = " + a[k - 1]);
	}
}
