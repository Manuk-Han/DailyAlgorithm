import java.util.Arrays;
import java.util.Scanner;

public class No5800s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0 ; i < N ; i++){
            int n = scanner.nextInt(), score[] = new int[n];

            for(int j = 0 ; j < n ; j++) score[j] = scanner.nextInt();
            Arrays.sort(score);
            System.out.printf("Class %d\n Max %d, Min %d, Largest gap %d", i+1, score[n-1], score[0], score[n-1]-score[0]);
        }
    }
}
