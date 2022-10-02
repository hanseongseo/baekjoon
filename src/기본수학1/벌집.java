package 기본수학1;

import java.util.Scanner;

public class 벌집 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int resultCount = 1;
        int resultValue = 1;
        while (input > resultValue) {
            resultValue += resultCount * 6;
            resultCount++;
        }
        System.out.println(resultCount);
    }
}
