/******************************************
 2022-05-04 (Wed)
 번호 : 14381
 문제 : 숫자 세는 양
 ******************************************/

import java.util.Scanner;

public class No14381s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for(int test = 1 ; test <= T ; test++){
            int N = scanner.nextInt();

            if(N == 0){
                System.out.printf("Case #%d: INSOMNIA\n", test);
                continue;
            }

            boolean[] check = new boolean[10];
            int i = 1;

            while(true){
                String num = i*N + "";
                for(char k : num.toCharArray())
                    check[k-'0'] = true;

                int checkNum = 0;
                for(int j = 0 ; j < 10 ; j++)
                    if(check[j]) checkNum++;
                if(checkNum == 10) {
                    System.out.printf("Case #%d: %d\n", test, i*N);
                    break;
                }

                i++;
            }
        }
    }
}
