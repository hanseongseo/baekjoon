package 반복문;

/*import java.io.*;

public class 반복문10951 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			int i = 0;
			String s = br.readLine();
			int A = Integer.parseInt(s.split(" ")[0]);
			int B = Integer.parseInt(s.split(" ")[1]);
			
			if(s.length() > 0) {
				bw.write(A+B);
			} else {
				break;
			}
		}
	}

}*/

import java.util.*;

public class 반복문10951 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a+b);
		}
		in.close();
		
	}
	
}
