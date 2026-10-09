package Practice_Tasks;

public class PerfectSquare {
	public static void main(String[] args) {

		int num = 25;

		for (int i = 1; i <= num; i++) {

			if (i * i == num) {
				System.out.println("Perfect Square:" + " " + num);
				break;
			}
		}
	}
}