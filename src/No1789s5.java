import java.util.Scanner;

public class No1789s5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 0 ; t < T ; t++){
            int N = sc.nextInt();
            int[] arr = new int[N];

            for(int n = 0 ; n < N ; n++)
                arr[n] = sc.nextInt();

            int max = 0, count = 0;
            long sum = 0, part = 0;

            for(int i = N-1 ; i >= 0 ; i--){
                if(arr[i] <= max){
                    count++;
                    part += arr[i];
                }
                else{
                    sum += (long) max * count - part;
                    count = 0;
                    part = 0;
                    max = arr[i];
                }
            }

            sum += (long) max * count - part;

            System.out.println(sum);
        }
    }
}
