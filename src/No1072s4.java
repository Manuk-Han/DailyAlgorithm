/******************************************
 2022-04-13 (Wed)
 번호 : 1072
 문제 : 게임
 ******************************************/

import java.util.Scanner;

public class No1072s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double X = scanner.nextDouble(), Y = scanner.nextDouble(), Z = Math.floor((100 * Y) / X);

        if( Z >= 99){
            System.out.print("-1");
            return;
        }

        int n = 1;
        while(Math.floor((100 * ++Y) / ++X) <= Z) n++;

        System.out.print(n);
    }
}

//TODO : 100*(x/y) != (100*x)/y 이해하기임 & 다른 방식 고려