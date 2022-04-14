/******************************************
 2022-04-14 (Thu)
 번호 : 1094
 문제 : 막대기
 ******************************************/

import java.util.Scanner;

public class No1094s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        String binary = Integer.toBinaryString(X) + ""; // 2진수로 변환 후 문자열로 변환

        int n = 0;
        for(int i = 0 ; i < binary.length() ; i++){
            if(binary.charAt(i) == '1') n++; // 각 자리수 별 1인 경우 막대기수 증가
        }

        System.out.print(n);
    }
}
