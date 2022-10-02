package 반복문;

import java.io.*;

public class 반복문2438 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			
			for(int x = 1; x <= i; x++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}

}
