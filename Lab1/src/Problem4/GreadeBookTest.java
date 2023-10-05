package Problem4;

import Problem1_1.Student;

public class GreadeBookTest {
	public static void main(String[] args) {
		Course courses = new Course("OOP", 5, new Time(12,30), "CS101");
		Student s1 = new Student("Diana ", 1, 99);
		Student s2 = new Student("Zhanaru ", 2, 99);
		Student s3 = new Student("Zhanerke ", 3, 96);
		Student s4 = new Student("Madi ", 4, 72);
		Student s5 = new Student("Alikhan ", 5, 87);
		Student s6 = new Student("Student A ", 6, 34);
		Student s7 = new Student("Leila", 7, 100);
		Student s8 = new Student("Aruzhan ", 8, 94);
		
		GreadeBook gb = new GreadeBook (courses);
		gb.displayMessage();
		gb.push(s1);
		gb.push(s2);
		gb.push(s3);
		gb.push(s4);
		gb.push(s5);
		gb.push(s6);
		gb.push(s7);
		gb.push(s8);
		gb.outputBarChart();
		gb.displayGradeReport();
		System.out.println("Grades distribution:");
		gb.outputDistribution();
	}

}
