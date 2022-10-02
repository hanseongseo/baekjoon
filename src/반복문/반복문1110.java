package 반복문;

import java.io.*;

public class 반복문1110{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N = br.readLine();
		String A = N;
		int i = 0;
		while(true) {
			if(A.length() < 2) {
				A = 0+A;
			} 
			int x = Integer.parseInt(A.split("")[0]);
			int y = Integer.parseInt(A.split("")[1]);

			String a = A.split("")[0];
			String b = A.split("")[1];
			A = b + ((x + y) % 10);
			i++;
			if(Integer.parseInt(A) == Integer.parseInt(N)) {
				break;
			}
			
		}
		bw.write(Integer.toString(i));
		bw.flush();
	}
	
}

