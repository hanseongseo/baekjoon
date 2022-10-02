package 문자열;

import java.util.*;

public class 문자열11720 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] inputArray = in.next().split("");
		
		int result = 0;
		for(int i = 0 ; i < inputArray.length ; i++) {
			result += Integer.parseInt(inputArray[i]);
		}
		
		System.out.println(result);
	}

}
