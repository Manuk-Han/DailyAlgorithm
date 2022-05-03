import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No8979s5 {
    public static void main(String[] args) {

        int count = 5;
        int hap = 0;
        switch (count++){
            case 3: hap+=count;
            case 4 : hap+=count;
            case 5: hap+=count;
            default:hap+=count;
        }
        System.out.println(hap);
    }
}
