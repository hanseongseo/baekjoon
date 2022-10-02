package 배열;

import java.util.*;

public class 배열4344 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCaseCount = in.nextInt();
		
		for(int caseNum = 0 ; caseNum < testCaseCount ; caseNum++) {
			int studentCount = in.nextInt();
			double[] scoreArray = new double[studentCount];
			for(int i = 0 ; i < studentCount ; i++) {
				scoreArray[i] = in.nextInt();
			}
			//scoreArray 평균 구하기
			double scoreSum = 0;
			for(int i = 0 ; i < scoreArray.length ; i++) {
				scoreSum += scoreArray[i];	
			}
			double scoreAvg = scoreSum/scoreArray.length;

			//scoreArray 중 scoreAvg넘는 학생 count
			double resultCount = 0;
			for(int i = 0 ; i < scoreArray.length ; i++) {
				if(scoreArray[i] > scoreAvg) {
					resultCount++;
				}
			}
			System.out.println(String.format("%.3f", resultCount/studentCount*100) + "%");

		}
		
		
	}

}


//score 배열 만들기
//int studentCount = in.nextInt();
//double[] scoreArray = new double[studentCount];
//for(int i = 0 ; i < studentCount ; i++) {
//	scoreArray[i] = in.nextInt();
//}
////scoreArray 평균 구하기
//double scoreSum = 0;
//for(int i = 0 ; i < scoreArray.length ; i++) {
//	scoreSum += scoreArray[i];	
//}
//double scoreAvg = scoreSum/scoreArray.length;
//
////scoreArray 중 scoreAvg넘는 학생 count
//double resultCount = 0;
//for(int i = 0 ; i < scoreArray.length ; i++) {
//	if(scoreArray[i] > scoreAvg) {
//		resultCount++;
//	}
//}
//System.out.println(String.format("%.3f", resultCount/studentCount*100) + "%");
