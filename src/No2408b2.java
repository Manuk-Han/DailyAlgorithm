import java.util.Scanner;

public class No2408b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자의 개수
        int n = sc.nextInt();
        long result = sc.nextLong();

        for (int i = 0; i < n - 1; i++) {
            // 연산자 입력
            String operator = sc.next().trim();

            // 숫자 입력
            String numberStr = sc.next().trim();
            long nextNumber;

            try {
                nextNumber = Long.parseLong(numberStr); // 숫자로 변환
            } catch (NumberFormatException e) {
                System.err.println("Invalid number format: " + numberStr);
                return; // 잘못된 입력이므로 프로그램 종료
            }

            // 연산 수행
            switch (operator) {
                case "+":
                    result += nextNumber;
                    break;
                case "-":
                    result -= nextNumber;
                    break;
                case "*":
                    result *= nextNumber;
                    break;
                case "/":
                    if (nextNumber == 0) {
                        System.err.println("Division by zero is not allowed.");
                        return; // 0으로 나누면 프로그램 종료
                    }
                    if (result < 0) {
                        result = -(-result / nextNumber);
                    } else {
                        result /= nextNumber;
                    }
                    break;
                default:
                    System.err.println("Invalid operator: " + operator);
                    return; // 잘못된 연산자가 들어오면 프로그램 종료
            }
        }

        System.out.println(result);
        sc.close();
    }
}
