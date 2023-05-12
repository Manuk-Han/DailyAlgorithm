import java.util.Scanner;

public class No2116g5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] map = {5,3,4,1,2,0};

        int N = scanner.nextInt();
        int[][] dice = new int[N][6];
        int[][] diceMap = new int[N][6];

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < 6 ; j++){
                int input = scanner.nextInt()-1;
                dice[i][j] = input;
                diceMap[i][input] = j;
            }
        }

        int answer = 0;
        int[] sum = new int[6];
        for(int i = 0 ; i < 6 ; i++){

            int prev = i;
            for(int j = 0 ; j < N ; j++){

                int max = 0, opposite = dice[j][map[diceMap[j][prev]]];
                for(int k = 0 ; k < 6 ; k++){
                    if(k == prev || k == opposite) continue;
                    max = Math.max(max, k);
                }

                sum[i] += max;
                prev = opposite;
            }

            answer = Math.max(answer, sum[i]);
        }

        System.out.println(answer+N);
    }
}
