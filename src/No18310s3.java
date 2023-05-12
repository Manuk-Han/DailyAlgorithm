import java.util.Scanner;

public class No18310s3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(), input[] = new int[100001], max = 0, min = 100000, sum = 0;

        for(int i = 0 ; i < N ; i++) {
            int num = scanner.nextInt();
            input[num]++;
            max = Math.max(max, num);
            min = Math.min(min, num);
            sum += num;
        }

        int[][] array = new int[max+1][2];

        for(int i = min ; i < max+1 ; i++){
            array[i][0] = array[i-1][0] + input[i];
            array[i][1] = N - array[i][0];
        }

        long antenna = sum - N*min, index = 0, minAntenna = Long.MAX_VALUE;

        for(int i = min ; i < max+1 ; i++){
            antenna += array[i-1][0] - array[i-1][1];
            if(minAntenna > antenna){
                minAntenna = antenna;
                index = i;
            }
        }

        System.out.println(index);
    }
}
