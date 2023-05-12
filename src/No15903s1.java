import java.util.Scanner;

public class No15903s1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), m = scanner.nextInt();
        long sum = 0;

        long[] arr = new long[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        int start = 0, end = 0;
        for(int i = 0 ; i < m ; i++){
            long minStart = Long.MAX_VALUE;
            for(int j = 0 ; j < n ; j++) {
                if(arr[j] < minStart){
                    minStart = arr[j];
                    start = j;
                }
            }

            long minEnd = Long.MAX_VALUE;
            for(int j = 1 ; j < n ; j++){
                int index = (start+j) % n;

                if(arr[index] < minEnd){
                    minEnd = arr[index];
                    end = index;
                }
            }

            arr[start] = arr[end] = minStart+minEnd;

            sum += arr[start];
        }

        System.out.println(sum);
    }
}
