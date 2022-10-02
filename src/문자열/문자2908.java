package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        String[] inputArr1 = stringTokenizer.nextToken().split("");
        String tmp1 = inputArr1[0];
        inputArr1[0] = inputArr1[2];
        inputArr1[2] = tmp1;
        int[] result1Arr = new int[inputArr1.length];
        for (int i = 0; i < inputArr1.length; i++) {
            result1Arr[i] = Integer.parseInt(inputArr1[i]);
        }

        String[] inputArr2 = stringTokenizer.nextToken().split("");
        String tmp2 = inputArr2[0];
        inputArr2[0] = inputArr2[2];
        inputArr2[2] = tmp2;
        int[] result2Arr = new int[inputArr2.length];
        for (int i = 0; i < inputArr2.length; i++) {
            result2Arr[i] = Integer.parseInt(inputArr2[i]);
        }

        int result1 = (result1Arr[0] * 100) + (result1Arr[1] * 10) + result1Arr[2];
        int result2 = (result2Arr[0] * 100) + (result2Arr[1] * 10) + result2Arr[2];

        if (result1 > result2) {
            System.out.println(result1);
        } else {
            System.out.println(result2);
        }
    }
}
