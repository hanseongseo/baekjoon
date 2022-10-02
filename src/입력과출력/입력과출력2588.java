package 입력과출력;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;

public class 입력과출력2588 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		String stringBValue = Integer.toString(b);
		
		
		String[] bValue = Integer.toString(b).split("");
		
		int[] digits = new int[bValue.length];
		
		for (int i = 0; i < digits.length; i++) {
			digits[i] = Integer.parseInt(bValue[i]);
		}
		
		
		
//		int[] digits2 = Stream.of(String.valueOf(b).split(""))
//				.mapToInt(Integer::parseInt)
//				.toArray();
        
        int i = 0;
        
        while(i < digits.length) {
    		System.out.println(a * digits[digits.length - 1 - i]);
            i++;
        }
        System.out.println(a*b);
        
	}

}
