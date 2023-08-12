import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        for(int i = scanner.nextInt() ; i > 0 ; i--){
            int n = scanner.nextInt(), answer = 0;

            for(int j = 2 ; j < n+1 ; j++)
                for(int k = n ; k%j == 0 ; k /= j) answer++;

            sb.append(answer+"\n");
        }

        System.out.println(sb);
    }
}