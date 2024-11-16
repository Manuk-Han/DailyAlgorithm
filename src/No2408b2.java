import java.util.Scanner;

public class No2408b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long result = sc.nextLong();

        for (int i = 0; i < n - 1; i++) {
            char operator = sc.next().charAt(0);
            long nextNumber = sc.nextLong();

            switch (operator) {
                case '+':
                    result += nextNumber;
                    break;
                case '-':
                    result -= nextNumber;
                    break;
                case '*':
                    result *= nextNumber;
                    break;
                case '/':
                    if (result < 0) {
                        result = -(-result / nextNumber);
                    } else {
                        result /= nextNumber;
                    }
                    break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
