package 기본수학1;

import java.io.*;

public class 달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] stringTokenizer = bufferedReader.readLine().split(" ");

        int up = Integer.parseInt(stringTokenizer[0]);
        int down = Integer.parseInt(stringTokenizer[1]);
        int upSubtractDown = up - down;
        int height = Integer.parseInt(stringTokenizer[2]);
        int period = (height - down) / upSubtractDown;
        if ((height - down) % upSubtractDown != 0) {
            period++;
        }
        System.out.println(period);
    }
}

