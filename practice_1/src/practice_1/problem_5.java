package practice_1;

import java.util.Scanner;

public class problem_5 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int percent = sc.nextInt();
		double final_res = (num*percent) / 100;
		
		System.out.println("In your account: " + final_res);
		
		sc.close();	
	}
}
