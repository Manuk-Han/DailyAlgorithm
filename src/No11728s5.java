/******************************************
 2022-04-18 (Mon)
 번호 : 11728
 문제 : 배열 합치기
 ******************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No11728s5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer splitInput = new StringTokenizer(input, " ");

        int N = Integer.parseInt(splitInput.nextToken()), M = Integer.parseInt(splitInput.nextToken());
        int array[] = new int[N+M];

        String inputN = br.readLine();
        StringTokenizer splitN = new StringTokenizer(inputN, " ");
        for(int i = 0 ; i < N ; i++) array[i] = Integer.parseInt(splitN.nextToken());

        String inputM = br.readLine();
        StringTokenizer splitM = new StringTokenizer(inputM, " ");
        for(int i = 0 ; i < M ; i++) array[N + i] = Integer.parseInt(splitM.nextToken());

        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();

        for(int i : array) sb.append(i + " ");

        System.out.print(sb);
    }
}

//TODO : 합병정렬로 구현하기