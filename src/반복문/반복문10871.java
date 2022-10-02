package 반복문;

import java.io.*;

public class 반복문10871 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String Input = br.readLine();
		int N = Integer.parseInt(Input.split(" ")[0]);
		int X = Integer.parseInt(Input.split(" ")[1]);
		String s = br.readLine();
		
		for(int i = 0; i < N; i++) {
			
			int a = Integer.parseInt(s.split(" ")[i]);
			
			if(a < X) {
				bw.write(a + " ");
			}
			
		}
		bw.flush();
		
		
		
		
		
	}

}
