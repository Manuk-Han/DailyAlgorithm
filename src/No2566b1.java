import java.util.Scanner;

public class No2566b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0, m = 0, max = 0;

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                int input = scanner.nextInt();

                if(input > max) {
                    max = input;
                    n = i;
                    m = j;
                }
            }
        }

        System.out.print(max + "\n" + (n+1) + " " + (m+1));
    }
}
