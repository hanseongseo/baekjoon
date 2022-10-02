package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] stringTokenizer = bufferedReader.readLine().split(" ");

        BigInteger input1 = new BigInteger(stringTokenizer[0]);
        BigInteger input2 = new BigInteger(stringTokenizer[1]);

        System.out.println(input1.add(input2));
    }
}
