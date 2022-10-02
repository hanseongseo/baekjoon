package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());

        int count5 = input / 5;
        int count3 = 0;

        int result = -1;

        if (input % 5 == 0) {
            result = count5;
        } else {
            for (int i = 0; i <= input / 5; i++) {
                if ((input - (5 * i)) % 3 == 0) {
                    result = input / 3;
                    count5 = i;
                    count3 = (input - (5 * i)) / 3;
                    if (result > count3 + count5) {
                        result = count3 + count5;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
