import java.util.Scanner;

public class No1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        boolean []arr = new boolean[size];

        int num = scanner.nextInt();

        StringBuilder sb = new StringBuilder("<");

        int now = 0, nowSize = size;

        while (nowSize != 0){
            for(int i = 1 ; i < num % nowSize ; i++) {
                now = (now+1) % size;
                if(arr[now]) {
                    i--;
                    System.out.println(now);
                }


            }

            arr[now] = true;
            nowSize--;

            sb.append(now + 1).append(", ");
        }

        System.out.println(sb.substring(0, sb.length()-2)+">");
    }
}
