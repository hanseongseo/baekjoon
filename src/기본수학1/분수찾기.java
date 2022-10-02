package 기본수학1;

import java.util.Scanner;

public class 분수찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int resultCount = 0;
        int resultValue = 0;

        int loopVar = 1;
        while (input > resultValue) {
            resultValue += loopVar;
            resultCount++;
            loopVar++;
        }

        int resultValueSubtractInput = resultValue - input;

        int molecule;
        int denominator;

        if (resultCount % 2 == 1) {
            denominator = resultCount - resultValueSubtractInput;
            molecule = 1 + resultValueSubtractInput;
        } else {
            molecule = resultCount - resultValueSubtractInput;
            denominator = 1 + resultValueSubtractInput;
        }
        System.out.println(molecule + "/" + denominator);
    }
}
