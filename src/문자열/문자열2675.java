package 문자열;

import java.util.*;
import java.io.*;

public class 문자열2675 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int k = 0 ; k < T ; T++) {

			String[] inputArray = br.readLine().split(" ");
			
			int R = Integer.parseInt(inputArray[0]);
			
			String S = inputArray[1];
			
			for(int i = 0 ; i < S.length() ; i++) {
				for(int j = 0 ; j < R ; j++) {
					System.out.print(S.charAt(i));
				}
			}
			
			System.out.println();
			
			
		}
	}

}


//String[] inputArray = br.readLine().split(" ");
//int R = Integer.parseInt(inputArray[0]);
//String S = inputArray[1];
//
//
//
//for(int i = 0 ; i < S.length() ; i++) {
//	for(int j = 0 ; j < R ; j++) {
//		bw.write(S.split("")[i]);
//	}
//}
//
//bw.flush();
