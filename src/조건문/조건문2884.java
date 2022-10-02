package 조건문;

import java.util.Scanner;

public class 조건문2884 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		
		if(M<45) {
			if(H < 1) {
				H = 23;
				System.out.println(H + " " + (60+(M-45)));
			} else {
				H--;
				System.out.println(H + " " + (60+(M-45)));
			}
		} else {
			System.out.println(H + " " + (M-45));
		}
		
	}

}
