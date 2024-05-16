
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Oscar";
		String lastName = "Diaz";
		String fullName = createFullName(firstName, lastName);
		
		String fullName2 = createFullName("Bob", lastName);
		System.out.println(fullName);
		System.out.println(fullName2);
	
	//
	int[] grades = { 100, 100, 100 };
	Student student1 = new Student("Molly Mack", grades);
	Student student2 = new Student("Molly Mack", grades);
	Student student3 = new Student
	
	System.out.println("student1 vs. student2 Equality Example:");
	System.out.println("---------------------------------------");
	System.out.println("Is student1 == student2? " 
	                    + (student1 == student2));
	System.out.println("Is student1.equals(student2)? " 
	                    + (student1.equals(student2)));
	System.out.println("Is student1.equals(\"Molly Mack\")? " 
	                    + (student1.equals("Molly Mack")));
	System.out.println("Is student1.fullName.equals(\"Molly Mack\")? " 
	                    + (student1.fullName.equals("Molly Mack")));

	}

	public static String createFullName(String x, String y) {
		return x + " " + y;		
	}

}
