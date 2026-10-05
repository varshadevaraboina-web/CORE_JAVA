package Practice_Tasks;

public class StringStartsWithA {

	
	    static void checkName(String name) {

	        if (name.startsWith("A")) {
	            System.out.println("Name starts with A:"+" "+name);
	        } else {
	            System.out.println("Name does not start with A:"+" "+name);
	        }
	    }

	    public static void main(String[] args) {

	        checkName("varsha");
	    }
	}