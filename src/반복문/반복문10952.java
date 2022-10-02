package 반복문;

import java.io.*;

public class 반복문10952 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String s = br.readLine();
			int A = Integer.parseInt(s.split(" ")[0]);
			int B = Integer.parseInt(s.split(" ")[1]);
			
			if(A != 0 || B != 0) {
				bw.write(A + B + "\n");
			} else {
				break;
			}
			
		}
		bw.flush();
		
	}
	

}
