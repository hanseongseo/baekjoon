package 배열;

import java.util.*;

public class 배열3052 {
	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		
		int answer = 0;
//		int resultArray[] = new int[42];
//		
//		int[] arr = new int[10];  //입력값 배열 arr
//		
//		for(int i = 0; i < 10; i++) {
//			resultArray[in.nextInt()%42]++;
//		}
//		
//		for (int i = 0; i < resultArray.length; i++) {
//			if (resultArray[i] > 0) {
//				answer++;
//			}
//		}
		
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			set.add(in.nextInt()%42);
		}
		
		System.out.println(set.size());
		
//		System.out.println(answer);
	
		
		
//		int zerocount = 0;
//		for(int i = 0; i < 42; i++) {
//			if(result[i] == 0) {
//				zerocount++;
//			}
//		}
//		
//		System.out.println(result.length - zerocount + 1);
		
	}

}
