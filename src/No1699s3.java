/******************************************
 2022-04-19 (Tue)
 번호 : 1699
 문제 : 제곱수의 합
 ******************************************/

import java.util.Scanner;

public class No1699s3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N = scanner.nextInt();
        int array[]=new int[N+1];

        array[0]=0;
        for(int i = 1 ; i <= N ; i++){
            int min = 10000000;
            for(int j = 1 ; j * j <= i ; j++){
                min = array[i-j*j] <= min ? array[i-j*j] : min;
            }
            array[i] = min+1;
        }
        System.out.print(array[N]);
    }
}
