package Practice_Tasks;

public class NewArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60};

        int b[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int prev, next;

            if (i == 0) {
                prev = arr[i];
            } else {
                prev = arr[i - 1];
            }

            if (i == arr.length - 1) {
                next = arr[i];
            } else {
                next = arr[i + 1];
            }

            b[i] = prev + next;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}