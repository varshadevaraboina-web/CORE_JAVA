package Practice_Tasks;

public class Student {
	
	static int count=0;
		
	Student(){
		count++;
	}
	
	
	
	public static void main(String[] args) {
		
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		System.out.println("Count of objects");
		System.out.println(count);
		
		
		}

}
