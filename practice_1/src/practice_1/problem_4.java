package practice_1;

import java.util.Scanner;

public class problem_4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double D = (b*b) - (4*a*c);
        double x1, x2;
        
        if (D < 0){
        	System.out.println("D is a negative number, it is ERROR");
        }
        else if (D == 0){
        	x1 = x2 = ((-1)*b) / (2*a);
        	System.out.println(x1);
        } 
        else {
        	x1 = ((-1)*b + Math.sqrt(D)) / (2*a);
        	x2 = ((-1)*b - Math.sqrt(D)) / (2*a);
        	System.out.println("x1 = " + x1 + " " + "x2 = " + x2);
        }
        sc.close();
    }
}
