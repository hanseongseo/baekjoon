package 반복문;

import java.util.Scanner;

public class 반복문8393 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] result = new int[n];
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			result[i-1] = i;
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
