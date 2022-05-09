/******************************************
 2022-05-09 (Tue)
 번호 : 10610
 문제 : 30
 ******************************************/

import java.util.Scanner;

public class No10610s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        int array[] = new int[10], sum = 0;
        for(char c : input.toCharArray()) {
            array[c-'0']++;
            sum += c-'0';
        }

        if(sum % 3 != 0 || array[0] == 0)
            System.out.print(-1);
        else
            for(int i = 9 ; i >= 0 ; i--) System.out.print((i+"").repeat(array[i]));

    }
}
