package 함수;

import java.util.*;

public class 함수15596 {
public static int d(int num) {
		int dn = num;
		String digitArray[] = (Integer.toString(num)).split(""); //자릿수 배
			
		for(int digitCount = 0 ; digitCount < digitArray.length ; digitCount++) {
			dn += Integer.parseInt(digitArray[digitCount]);
		}
		return dn;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] resultArray = new int[10001];
		for(int i = 0 ; i < 10001 ; i++) {
			if(d(i) <= 10000) {
				resultArray[d(i)] = 1;
			}
		}
		for(int i = 0 ; i < 10000 ; i++) {
			if(resultArray[i] == 0) {
				System.out.println(i);
			}
		}
	}
}

//public static void selfNum() {
//int[] dnArray = new int[10000];
//for(int n = 1 ; n <= 10000 ; n++) {
//	int dn = n;
//	String nArray[] = new String[Integer.toString(n).length()];
//	for(int i = 0 ; i < n ; i++) {   ////n의 자릿수 배열 만들기
//		if(i < 10) {
//			nArray[0] = Integer.toString(i);
//		} else {
//			nArray[i] = Integer.toString(n).split("")[i];	
//		}
//		
//	}
//	for(int i = 0 ; i < nArray.length ; i++) {   //dn 추출
//		dn += Integer.parseInt(nArray[i]);
//	}
//	dnArray[n-1] = dn;
//	
//}
//for(int i = 0 ; i < 10000 ; i++) {
//	System.out.println(dnArray[i]);
//}
//
//}
//
//public static void main(String[] args) {
//selfNum();
//}
//public static void main(String[] args) {
//Scanner in =  new Scanner(System.in);
//for(int result = 1 ; result <= 10000 ; result++) {
//	if((result == selfNum()) == false) {
//		System.out.println(result);
//	}
//}
//}

