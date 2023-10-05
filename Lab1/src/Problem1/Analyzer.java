package Problem1;

import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Data d = new Data();
		int a = 0;
		
		while(true) {
			System.out.println("Enter number (Q to quit): ");
			String s = sc.next();
			if (s.equals("Q")) break;
			a = Integer.parseInt(s);
			d.addVal(a);
		}
		
		System.out.println("Average = " + d.getAverage());
		System.out.println("Maximum = " + d.getMax());

		sc.close();
	}
}
   