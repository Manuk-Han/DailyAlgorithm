import java.util.Scanner;

public class No3460b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 0 ; i < T ; i++){
            String n = Integer.toBinaryString(scanner.nextInt());
            StringBuilder output = new StringBuilder();

            for(int j = 0 ; j < n.length() ; j++)
                if(n.charAt(n.length()-1-j) == '1') output.append(j).append(" ");

            System.out.println(output);
        }
    }
}
