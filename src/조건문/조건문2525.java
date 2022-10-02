package 조건문;

import java.util.Scanner;

public class 조건문2525 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		int t = in.nextInt();
			
		int a = h*60 + m + t;
		int b = a/60%24;
		
		h = b;
		m = a%60;
		
		System.out.println(h + " " + m);
		
	}

}
