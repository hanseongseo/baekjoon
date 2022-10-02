package 배열;
import java.util.*;

public class 배열8958 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		
		for(int b = 0; b < N; b++) {
			int answer = 0;
			int answerArray[] = new int[80 * N]; //연속된 O합의 배열
			String test = in.next();
			String[] testArray = new String[test.length()];
			for(int i = 0; i < test.length(); i++) {
				testArray[i] = test.split("")[i];
			}

			int count = 0;
			for(int i = 0; i < test.length(); i++) { //answerArray 만들기
				if(testArray[i].equals("O")) {
					count++;
				} else {
					for (int a = 0; a <= count; a++) {
			            answerArray[i + test.length() * b] += a;
			        }
					count = 0;
				}
			}
			for(int i = 0; i <= count; i++) {
				answerArray[test.length()] += i;
			}
			for(int i = 0; i < answerArray.length; i++) {
				answer += answerArray[i];
			}
			System.out.println(answer);
		}
		
		
	}

}

//String test = in.next();
//String[] testArray = new String[test.length()];
//for(int i = 0; i < test.length(); i++) {
//	testArray[i] = test.split("")[i];
//}
//
//int count = 0;
//for(int i = 0; i < test.length(); i++) { //answerArray 만들기
//	if(testArray[i].equals("O")) {
//		count++;
//	} else {
//		for (int a = 0; a <= count; a++) {
//            answerArray[i] += a;	
//        }
//		count = 0;
//	}
//}
//for(int i = 0; i <= count; i++) {
//	answerArray[test.length()*a] += i;
//}

