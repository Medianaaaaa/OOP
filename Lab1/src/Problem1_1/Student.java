package Problem1_1;

public class Student {
	public String name;
	private int id;
	private int yearOfStudy;
	private int grade;

	public Student(String name, int id, int i ) {
		this.name = name;
		this.id = id;
		this.yearOfStudy = 1;
		this.grade = i;
	}
	public int getGrade() {
		return grade;
	}

	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getYear() {
		return yearOfStudy;
	}
	public void incrementYear() {
		this.yearOfStudy ++;
	}


	public int getPoint() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
