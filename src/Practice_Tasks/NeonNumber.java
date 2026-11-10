package Practice_Tasks;


public class NeonNumber {
    public static void main(String[] args) {

        int num = 9;
        int square = num * num;
        int sum = 0;

        while (square != 0) {

            int digit = square % 10;
            sum = sum + digit;

            square = square / 10;
        }
        System.out.println(num);
        if (sum == num) {
            System.out.println("Neon Number");
           
        } else {
            System.out.println("Not a Neon Number");
        }
    }
}