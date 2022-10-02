package 문자열;

import java.io.*;
import java.util.Arrays;

public class 문자열10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		
		char[] alphabet = new char[26];
		for(int i = 0 ; i < alphabet.length; i++) {
			alphabet[i] = ((char)(97+i));
			
		}
		
		int[] resultArray = new int[26];
		Arrays.fill(resultArray, -1);
		
		for(int i = 0 ; i < S.length() ; i++) {
			for(int j = 0 ; j < alphabet.length ; j++) {
				if(S.charAt(i) == alphabet[j]) {
					if(resultArray[j] == -1) {
						resultArray[j] = i;
					}
				}
			}
		}
		for(int i = 0 ; i < resultArray.length ; i++) {
			bw.write(resultArray[i] + " ");
		}
		bw.flush();
	}

}
