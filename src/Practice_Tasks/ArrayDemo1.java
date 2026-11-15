package Practice_Tasks;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int[] marks= {92,98,96,91,83,60};
		
		double sum=0;
		double avg=0;
		
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
			}
		avg=sum/marks.length;
		System.out.println("Total marks of the student:"+" "+sum);
		System.out.println("Average marks of the student:"+" "+avg);

		}

	}


