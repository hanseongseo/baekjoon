package 배열;

import java.util.*;

public class 배열2562 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[9];
		int max = 0;
		int count = 1;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i = 0; i <9; i++) {
			if(max < arr[i]) {
				max = arr[i];
			} 
		}
		
		for(int i = 0; i < 9; i++) {
			if(arr[i] != max) {
				count++;
			}else {
				break;
			}
		}
			
		
		System.out.println(max + "\n" + count);
	}

}
