import java.util.Arrays;
import java.util.Scanner;

public class No1027g4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int []input = new int[N];

        for(int i = 0 ; i < N ; i++) input[i] = scanner.nextInt();

        int buildings[] = new int[N];

        for(int i = 0 ; i < N ; i++){
            int upMax = input[i], downMax = input[i], upCount = 0, downCount = 0;
            for(int j = i+1 ; j < N ; j++){
                if(input[j] > upMax){
                    upMax = input[j];
                    upCount++;
                }
            }
            for(int j = i-1 ; j >=0 ; j--){

            }
        }

        System.out.println();
    }
}