package Practice_Tasks;

public class Constructors {
	
	int id;
	String name;
	String location;
	
	
	
	//no argument constructor
	  Constructors(){
		int id;
		String name;
		String location;
		
	}
	
	//parameterized Constructors
	  Constructors(int id,String name,String location){
		  this.id=id;
		  this.name=name;
		  this.location=location;
		  System.out.println();
		  System.out.println("parameterized constructor");
		  System.out.println(id);
		  System.out.println(name);
		  System.out.println(location);
		  
		   }
	
	

	public static void main(String[] args) {
		Constructors c=new Constructors();
		c.id=101;
		c.name="varsha";
		c.location="jangaon";
		
		System.out.println("no argument constructor");
		System.out.println(c.id);
		System.out.println(c.name);
		System.out.println(c.location);
		
		Constructors c1=new Constructors(103,"Ram","hyd");
		
		
		
		
		}

}
