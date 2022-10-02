package 문제;

import java.io.*;

public class 세탁소 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] Menu = {"세탁", "헹굼", "탈수", "건조", "신발세탁", "계산"};
		String[] Price = {"10000", "9000", "8000", "7000", "6000", "5000"};
		String[] 강도 = {"약", "중", "강", "파워"};
		bw.write("세탁소 방문을 환영합니다." + "\n" + "원하시는 서비스 번호를 입력해주세요." + "\n" + 
		"1." + Menu[0] + " 2." + Menu[1] + " 3." + Menu[2] + " 4." + Menu[3] + " 5." + Menu[4] + " 6." + Menu[5] + "\n");
		
		bw.flush();
		
		
		int input = Integer.parseInt(br.readLine());
		
		if(input == 1) {
			bw.write("세탁 시간을 선택해주세요." + "\n" + 
					 "1.30분 2.40분 3.50분 4.60분" + "\n");
			bw.flush();
			String[] 세탁시간_arr = {" 30분", " 40분", " 50분", " 60분"};
			
			int 세탁시간 = Integer.parseInt(br.readLine());

			for(int i = 0; i < 5; i++) {
				if(세탁시간 == (i+1)) {
					Price[0] = Integer.toString(Integer.parseInt(Price[0]) + (i*1000));
					Menu[0] = Menu[0] + 세탁시간_arr[i];
					}
				}
			}
		
		if(input == 2) {
			bw.write("헹굼 강도를 선택해주세요." + "\n" + 
					 "1.약 2.중 3.강 4.파워" + "\n");
			bw.flush();
			int 헹굼강도 = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < 5; i++) {
				if(헹굼강도 == (i+1)) {
						Menu[1] = Menu[1] + "(" + 강도[i] + ")";
					}
				}
			}
		
		if(input == 3) {
			bw.write("탈수 강도를 선택해주세요." + "\n" + 
					 "1.약 2.중 3.강 4.파워" + "\n");
			bw.flush();
			int 탈수강도 = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < 5; i++) {
				if(탈수강도 == (i+1)) {
						Menu[2] = Menu[2] + "(" + 강도[i] + ")";
					}
				}
			}
		
		bw.write("선택해주신 세탁코스 비용은 : " + Price[input-1] + "원 입니다." + "\n" + 
				 "선택해주신 세탁코스는 : " + Menu[input-1] + "입니다." + "\n" + 
				 "감사합니다. 다음에 또 오세요.");
		
		bw.flush();	
		}
}

//package 문제;
//
//import java.util.*;
//
//public class 세탁소 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		String[] Menu = {"세탁", "헹굼", "탈수", "건조", "신발세탁", "계산"};
//		String[] Price = {"10000", "9000", "8000", "7000", "6000", "5000"};
//		String[] 강도 = {"약", "중", "강", "파워"};
//		System.out.println("세탁소 방문을 환영합니다." + "\n" + "원하시는 서비스 번호를 입력해주세요." + "\n" + 
//		"1." + Menu[0] + " 2." + Menu[1] + " 3." + Menu[2] + " 4." + Menu[3] + " 5." + Menu[4] + " 6." + Menu[5]);
//		
//		
//		
//		int input = in.nextInt();
//		
//		
//		if(input == 1) {
//			System.out.println("세탁 시간을 선택해주세요." + "\n" + 
//					 "1.30분 2.40분 3.50분 4.60분");
//			String[] 세탁시간_arr = {" 30분", " 40분", " 50분", " 60분"};
//			int 세탁시간 = in.nextInt();
//
//			for(int i = 0; i < 5; i++) {
//				if(세탁시간 == (i+1)) {
//					Price[0] = Integer.toString(Integer.parseInt(Price[0]) + (i*1000));
//					Menu[0] = Menu[0] + 세탁시간_arr[i];
//					}
//				}
//			}
//		
//		if(input == 2) {
//			System.out.println("헹굼 강도를 선택해주세요." + "\n" + 
//					 "1.약 2.중 3.강 4.파워");
//			int 헹굼강도 = in.nextInt();
//			
//			for(int i = 0; i < 5; i++) {
//				if(헹굼강도 == (i+1)) {
//						Menu[1] = Menu[1] + "(" + 강도[i] + ")";
//					}
//				}
//			}
//		
//		if(input == 3) {
//			System.out.println("탈수 강도를 선택해주세요." + "\n" + 
//					 "1.약 2.중 3.강 4.파워");
//			int 탈수강도 = in.nextInt();
//			
//			for(int i = 0; i < 5; i++) {
//				if(탈수강도 == (i+1)) {
//						Menu[2] = Menu[2] + "(" + 강도[i] + ")";
//					}
//				}
//			}
//		System.out.println("선택해주신 세탁코스 비용은 : " + Price[input-1] + "원 입니다." + "\n" + 
//				 "선택해주신 세탁코스는 : " + Menu[input-1] + "입니다." + "\n" + 
//				 "감사합니다. 다음에 또 오세요.");
//		}
//}
//
