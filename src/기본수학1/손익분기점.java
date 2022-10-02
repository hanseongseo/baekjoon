package 기본수학1;


import java.util.Scanner;

public class 손익분기점 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fixedCost = scanner.nextInt();
        int cost = scanner.nextInt();
        int price = scanner.nextInt();

        if (price <= cost) {
            System.out.println(-1);
        } else {
            System.out.println((fixedCost / (price - cost)) + 1);
        }
    }
}
