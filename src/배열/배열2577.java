package 배열;

import java.io.*;

public class 배열2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();
		
		String M = Integer.toString(Integer.parseInt(A)*Integer.parseInt(B)*Integer.parseInt(C));
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < M.length(); j++) {
				if(Integer.parseInt(M.split("")[j]) == i) {
					count++;
				}
			}
			bw.write(Integer.toString(count) + "\n");
		}
		bw.flush();
	}

}
