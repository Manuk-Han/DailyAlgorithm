import java.util.Scanner;

public class No1205s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), score = scanner.nextInt(), p = scanner.nextInt(), rank = 0, sameRank = 0;

        for(int i = 0 ; i < n ; i++) {
            int input = scanner.nextInt();
            if (input > score) rank++;
            if (input == score) sameRank++;
        }

        System.out.println(rank+sameRank >= p ? -1 : rank+1);
    }
}
