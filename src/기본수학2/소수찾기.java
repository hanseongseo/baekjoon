package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());
        String[] stringTokenizer = bufferedReader.readLine().split(" ");

        int[] tokenizerToInteger = new int[stringTokenizer.length];
        for (int i = 0; i < tokenizerToInteger.length; i++) {
            tokenizerToInteger[i] = Integer.parseInt(stringTokenizer[i]);
        }

        boolean[] result = new boolean[count];
        int resultCount = 0;

        for (int i = 0; i < count; i++) {
            if (tokenizerToInteger[i] == 1) {
                result[i] = true;
            } else if (tokenizerToInteger[i] == 2) {
                result[i] = false;
            } else {
                for (int j = 2; j < tokenizerToInteger[i]; j++) {
                    if (tokenizerToInteger[i] % j == 0) {
                        result[i] = true;
                        break;
                    }
                }
            }

        }

        for (boolean b : result) {
            if (!b) {
                resultCount++;
            }
        }
        System.out.println(resultCount);
    }
}
