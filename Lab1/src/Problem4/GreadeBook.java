package Problem4;

import java.util.Vector;
import Problem1_1.Student;

public class GreadeBook {
	public Vector<Student> Students;
	Course course;
	
	public GreadeBook(Course course) {
	}

	void GradeBook(Course course){
		this.course=course;
	}
	{
		Students = new Vector<Student>();
	}
	
	public void push(Student s) {
		Students.add(s);
	}
	
	public void displayMessage() {
		System.out.println(course);
	}
	
	public void displayGradeReport() {
		System.out.println("Class average is " + determineClassAverage() + ". Lowest grade is "+ minimum() + " ("+ minimumName() + ", ID:" + minimumID() + ")" + ". Highest grade is " + maximum()+" ("+maximumName()+", ID:" + maximumID() + ")"+"." );
	}
	
	public double determineClassAverage() {
		int sum=0;
		for(Student people:Students) {
			sum+=people.getGrade();
		}
		return sum/Students.size();
	}
	
	public int maximum() {
		int max = Integer.MIN_VALUE;
		for(Student people:Students) {
			if(people.getGrade()>max) {
				max=people.getGrade();
			}
		}
		return max;
	}
	public String maximumName() {
		int max = Integer.MIN_VALUE;
		String maxName="";
		for(Student people:Students) {
			if(people.getGrade()>max) {
				max=people.getGrade();
				maxName=people.name;
			}
		}
		return maxName;
	}
	
	public int maximumID() {
		int max = Integer.MIN_VALUE;
		int maxID=0;
		for(Student people:Students) {
			if(people.getGrade()>max) {
				max=people.getGrade();
				maxID=people.getId();
			}
		}
		return maxID;
	}
	public int minimum() {
		int min = Integer.MAX_VALUE;
		for(Student people:Students) {
			if(people.getGrade()<min) {
				min=people.getGrade();
			}
		}
		return min;
	}
	public String minimumName() {
		int min = Integer.MAX_VALUE;
		String minName="";
		for(Student people:Students) {
			if(people.getGrade()<min) {
				min=people.getGrade();
				minName=people.name;
			}
		}
		return minName;
	}
	
	public int minimumID() {
		int min = Integer.MAX_VALUE;
		int minID=0;
		for(Student people:Students) {
			if(people.getGrade()<min) {
				min=people.getGrade();
				minID=people.getId();
			}
		}
		return minID;
	}
		

	
	public void outputBarChart() {
		for(Student cur: Students) {
			System.out.println(cur.name + ":" + cur.getGrade());
		}
	}
	public void outputDistribution() {
		String s1="";
		String s2="";
		String s3="";
		String s4="";
		String s5="";
		String s6="";
		String s7="";
		String s8="";
		String s9="";
		String s10="";
		String s="";
		for(Student cur: Students) {
			if(cur.getGrade()>=0 && cur.getGrade()<=9) {
				s+='*';
			}
			if(cur.getGrade()>=10 && cur.getGrade()<=19) {
				s1+='*';
			}
			if(cur.getGrade()>=20 && cur.getGrade()<=29) {
				s2+='*';
			}
			if(cur.getGrade()>=30 && cur.getGrade()<=39) {
				s3+='*';
			}
			if(cur.getGrade()>=40 && cur.getGrade()<=49) {
				s4+='*';
			}
			if(cur.getGrade()>=50 && cur.getGrade()<=59) {
				s5+='*';
			}
			if(cur.getGrade()>=60 && cur.getGrade()<=69) {
				s6+='*';
			}
			if(cur.getGrade()>=70 && cur.getGrade()<=79) {
				s7+='*';
			}
			if(cur.getGrade()>=80 && cur.getGrade()<=89) {
				s8+='*';
			}
			if(cur.getGrade()>=90 && cur.getGrade()<=99) {
				s9+='*';
			}
			if(cur.getGrade()==100) {
				s10+='*';
			}
		}
		System.out.println("00-09: " + s);
		System.out.println("10-19: " + s1);
		System.out.println("20-29: " + s2);
		System.out.println("30-39: " + s3);
		System.out.println("40-49: " + s4);
		System.out.println("50-59: " + s5);
		System.out.println("60-69: " + s6);
		System.out.println("70-79: " + s7);
		System.out.println("80-89: " + s8);
		System.out.println("90-99: " + s9);
		System.out.println("100: " + s10);
	}
	
	
}
