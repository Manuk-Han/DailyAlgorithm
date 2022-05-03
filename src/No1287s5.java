import java.util.Scanner;

public class No1287s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fs = scanner.nextLine(), ft = scanner.nextLine();
        ft = ft.replace(fs, "");

        for(char c : ft.toCharArray()){
            if(c != '1'){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
