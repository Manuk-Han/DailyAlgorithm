import java.util.Arrays;
import java.util.Scanner;

public class No1027g4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int []input = new int[N];

        for(int i = 0 ; i < N ; i++) input[i] = scanner.nextInt();

        int[] up = new int[N], down = new int[N];
        for(int i = 1 ; i < N ; i++){
            if(input[i] > input[i-1]) up[i] = up[i-1]+1;
            else if(input[i] == input[i-1]) up[i] = up[i-1];
            else up[i] = 0;
        }
        for(int i = N-2 ; i >= 0 ; i--){
            if(input[i] > input[i+1]) down[i] = down[i-1]+1;
            else if(input[i] == input[i+1]) down[i] = down[i-1];
            else down[i] = 0;
        }

        System.out.println();
    }
}