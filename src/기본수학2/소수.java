//package 기본수학2;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class 소수 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] stringTokenizer = bufferedReader.readLine().split(" ");
//
//        int minValue = Integer.parseInt(stringTokenizer[0]);
//        int maxValue = Integer.parseInt(stringTokenizer[1]);
//        boolean[] resultArr = new boolean[maxValue - minValue + 1];
//
//        for (int i = minValue; i <= maxValue; i++) {
//            if (i != 1) {
//                for (int j = 2; j < i; j++) {
//                    if (i % j == 0) {
//                        resultArr[i - minValue] = true;
//                        break;
//                    }
//                }
//            }
//        }
//
//        int resultMin;
//        int resultSum = 0;
//
//        for (int i = 0; i < resultArr.length; i++) {
//            if
//        }
//
//        for (int i = 0; i < resultArr.length; i++) {
//            if (!resultArr[i]) {
//                resultSum += minValue + i;
//            }
//        }
//    }
//}
