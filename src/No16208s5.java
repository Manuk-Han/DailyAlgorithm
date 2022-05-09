/******************************************
 2022-05-09 (Mon)
 번호 : 16208
 문제 : 귀찮음
 ******************************************/

import java.util.Arrays;
import java.util.Scanner;

public class No16208s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt(), a[]= new int[input];
        long sum = 0, value = 0;
        for(int i = 0 ; i < input ; i++)
            sum += a[i] = scanner.nextInt();
        Arrays.sort(a);

        for(int i = 0 ; i < input-1 ; i++){
            sum -= a[i];
            value += a[i]*sum;
        }

        System.out.print(value);
    }
}
