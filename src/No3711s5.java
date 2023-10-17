import java.util.*;

public class No3711s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        boolean flag = true;

        for(int i = 0 ; i < N ; i++){
            int G = scanner.nextInt();

            int[] studentNum = new int[G];

            for(int j = 0 ; j < G ; j++) studentNum[j] = scanner.nextInt();

            flag = true;
            int k = 1;

            while(flag){
                List<Integer> check = new ArrayList<>();
                for(int j = 0 ; j < G ; j++) {
                    if (check.contains(studentNum[j] % k)) break;

                    if (j == G-1) {
                        System.out.println(k);
                        flag = false;
                    }

                    check.add(studentNum[j] % k);
                }
                k++;
            }
        }
    }
}
