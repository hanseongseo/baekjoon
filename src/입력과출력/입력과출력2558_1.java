package 입력과출력;

import java.util.Scanner;

public class 입력과출력2558_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		String[] bValue = Integer.toString(b).split("");
		int[] digits = new int[bValue.length];
		for(int i = 0; i<digits.length; i++) {
			digits[i] = Integer.parseInt(bValue[i]);
			System.out.println(a * digits[i]);
		}
		System.out.println(a*b);
		
	}

}
