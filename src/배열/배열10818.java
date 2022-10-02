package 배열;

import java.util.*;

public class 배열10818 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		int a = -1000000;
		int b = 1000001;
		
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			if(a < arr[i]) {
				a=arr[i];
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(b > arr[i]) {
				b = arr[i];
			}
		}
		System.out.println(b + " " + a);
	}

}
