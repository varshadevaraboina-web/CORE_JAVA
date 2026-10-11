package Practice_Tasks;

public class SecondLargest {

		public static void main(String[] args) {

		
		    int a = 10;
		    int b = 25;
		    int c = 16;

		    if (a > b && a > c) {
		        if (b > c) {
		            System.out.println("Second largest = " + b);
		        } else {
		            System.out.println("Second largest = " + c);
		        }
		    }
		    else if (b > a && b > c) {
		        if (a > c) {
		            System.out.println("Second largest = " + a);
		        } else {
		            System.out.println("Second largest = " + c);
		        }
		    }
		    else {
		        if (a > b) {
		            System.out.println("Second largest = " + a);
		        } else {
		            System.out.println("Second largest = " + b);
		        }
		    }
		
		}
}

		
