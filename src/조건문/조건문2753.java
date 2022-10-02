package 조건문;

import java.util.Scanner;

public class 조건문2753 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a % 4 == 0 && a % 100 != 0) {
			System.out.println(1);
		} else if(a % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
