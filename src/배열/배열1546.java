package 배열;

import java.util.*;

public class 배열1546 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		double[] scoreArray = new double[N];
		for(int i = 0; i < N; i++) {
			scoreArray[i] = in.nextInt();
		}
		
		double max = 0;
		for(int i = 0; i < N; i++) {
			if(max < scoreArray[i]) {
				max = scoreArray[i];
			}
		}
		
		double[] answerArray = new double[N];
		for(int i = 0; i < N; i++) {
			answerArray[i] = scoreArray[i]/max * 100;
		}
		
		double sum = 0;
		for(int i = 0; i < N; i++) {
			sum = sum + answerArray[i];
		}
		
		System.out.println(sum/N);
	}

}
