package 반복문;

import java.util.Scanner;

public class 반복문10950 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int loopInput = in.nextInt();
		int[] result = new int[loopInput];
		
		
		for(int i = 0; i < loopInput; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			result[i] = a + b;
		}
		
		for(int i = 0 ; i < result.length; i++) {			
			System.out.println(result[i]);
		}
		
	}

}
