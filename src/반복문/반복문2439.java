package 반복문;

import java.io.*;

public class 반복문2439 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			
			for(int y = 1; y <= N-i; y++) {
				bw.write(" ");
			}
			
			for(int x = 1; x <= i; x++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		
		
	}

}
