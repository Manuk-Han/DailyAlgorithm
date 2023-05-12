import java.util.Scanner;

public class No1236b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), m = scanner.nextInt();
        boolean map[][] = new boolean[n][m];

        for(int i = 0 ; i < n ; i++){
            String input = scanner.next();
            for(int j = 0 ; j < m ; j++)
                map[i][j] = input.charAt(j) == '.';
        }

        int k = n+m;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++)
                if(!map[i][j]) break;
            k--;
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++)
                if(!map[j][i]) break;
            k--;
        }

        System.out.print(k);
    }
}
