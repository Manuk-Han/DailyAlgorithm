import java.util.Scanner;

public class No1170g5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int channel = scanner.nextInt();
//
//        boolean[] broken = new boolean[10];
//        for(int i = scanner.nextInt() ; i > 0 ; i--) broken[scanner.nextInt()] = true;
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();
        int p = scan.nextInt();

        m += p;
        if(m >= 60){
            h++;
            m = 60 - m;
        }


    }
}
