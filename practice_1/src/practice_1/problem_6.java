package practice_1;

import java.util.Scanner;

public class problem_6 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		String t="";

		for (int i=s.length()-1; i>=0; i--) {
			t+= s.charAt(i);
		}
//		System.out.println(t);
		String result = (s.equals(t)) ? "Palindrome" : "NO";
		System.out.println(result);
		sc.close();
	}
	
}
