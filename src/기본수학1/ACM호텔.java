package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACM호텔 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int caseCount = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < caseCount; i++) {
            String[] stringTokenizer = bufferedReader.readLine().split(" ");
            int height = Integer.parseInt(stringTokenizer[0]);
            int width = Integer.parseInt(stringTokenizer[1]);
            int order = Integer.parseInt(stringTokenizer[2]);

            width = (order / height) + 1;
            if (order % height == 0) {
                width--;
            }

            if (order % height != 0) {
                height = order % height;
            }

            String heightToString = Integer.toString(height);
            String widthToString = Integer.toString(width);

            if (width < 10) {
                widthToString = "0" + width;
            }

            System.out.println(heightToString + widthToString);
        }

    }
}
