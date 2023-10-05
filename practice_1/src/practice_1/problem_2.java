package practice_1;

import java.util.Scanner;

public class problem_2 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int perimeter = 4*a;
		int area = a*a;
		double diagonal = Math.sqrt((a*a)+(a*a));
		
		System.out.println("The perimeter of square is " + perimeter);
		System.out.println("The area of square is " + area);
		System.out.println("The length of diagonal of square is " + diagonal);
		
		sc.close();
	}

}
