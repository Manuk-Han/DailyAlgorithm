/******************************************
 2022-05-13 (Fri)
 번호 : 5800
 문제 : 성적통계
 ******************************************/

import java.util.Arrays;
import java.util.Scanner;

public class No5800s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0 ; i < N ; i++){
            int n = scanner.nextInt(), score[] = new int[n];
            int max = 0;

            for(int j = 0 ; j < n ; j++) score[j] = scanner.nextInt();
            Arrays.sort(score);
            for(int j = 1 ; j < n ; j++) max = Math.max(max, score[j]-score[j-1]);
            System.out.printf("Class %d\nMax %d, Min %d, Largest gap %d\n", i+1, score[n-1], score[0], max);
        }
    }
}
