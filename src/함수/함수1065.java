package 함수;

import java.util.*;

public class 함수1065 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int result = 0;
		for(int i = 1 ; i <= N ; i++) {
			if(hans(i)) {
				result++;
			}
		}
		
		System.out.println(result);
	}
	
	//한수 추출
	public static boolean hans(int number) {
		//자릿수 추출
		boolean n = true;
		String[] digitArray = (Integer.toString(number)).split("");
		if(number < 100) {
			n = true;
		} else {
			
			int[] minusArray = new int[digitArray.length - 1];
			for(int i = 0 ; i < minusArray.length ; i++) {
				minusArray[i] = Integer.parseInt(digitArray[i + 1]) - Integer.parseInt(digitArray[i]);
			}
			
			boolean[] checkArray = new boolean[minusArray.length - 1];
			for(int i = 0 ; i < checkArray.length ; i++) {
				if(minusArray[i] == minusArray[i+1]) {
					checkArray[i] = true;
				}
			}
			
			for(int i = 0 ; i < checkArray.length ; i++) {
				if(checkArray[i] == false) {
					n = false;
				}
			}
		}
		
		return n;
		
		
	}

}
