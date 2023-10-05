package Problem1_1;


public class testStudent {
	public static void main(String[] args) {
		Student student1 = new Student ("Diana", 12345, 99);
		System.out.println("Year of study: " +student1.getYear());
		student1.incrementYear();
		
		System.out.println("Student name: " +student1.getName());
		System.out.println("ID: " +student1.getId());
		System.out.println("Increment year: " +student1.getYear());
	
	}
}
