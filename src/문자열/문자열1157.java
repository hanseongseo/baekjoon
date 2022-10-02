package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 문자열1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] inputArr = bufferedReader.readLine().toCharArray();
        int[] alphabetCountArr = new int[26];

        for (int i = 0; i < inputArr.length; i++) {
            if ((inputArr[i] <= 'z') && (inputArr[i] >= 'a')) {
                alphabetCountArr[inputArr[i] - 97]++;
            } else if ((inputArr[i] <= 'Z') && (inputArr[i] >= 'A')) {
                alphabetCountArr[inputArr[i] - 65]++;
            }
        }
        int maxCount = 0;
        for (int i = 0; i < alphabetCountArr.length; i++) {
            if (alphabetCountArr[i] == Arrays.stream(alphabetCountArr).max().getAsInt()) {
                maxCount++;
            }
        }
        if (maxCount < 2) {
            for (int i = 0; i < alphabetCountArr.length; i++) {
                if (alphabetCountArr[i] == Arrays.stream(alphabetCountArr).max().getAsInt()) {
                    System.out.println((char) (i + 'A'));
                }
            }
        } else {
            System.out.println("?");
        }
    }
}
