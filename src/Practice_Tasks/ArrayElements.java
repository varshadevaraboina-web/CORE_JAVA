package Practice_Tasks;

import java.util.Arrays;

public class ArrayElements {

	public static void main(String[] args) {

		// Declaration
		int[] a;

		// Creation
		a = new int[3];

		// Initialization
		a[0] = 2;
		a[1] = 8;
		a[2] = 3;

		// System.out.println(a);
		System.out.println("Elements are:");
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);

		// System.out.println(Arrays.toString(a));

//		for (int b : a) {
//			System.out.println(b);
//
//		}
		
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			
		}
		System.out.println(Arrays.toString(a));

	}

}
