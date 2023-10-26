package dclab;

import java.util.Scanner;

public class problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(), output = "";

        for(int i = 0 ; i < input.length() ; i++){
            if(i == input.length()-1) {
                output += (char)('a'+Integer.parseInt(input.charAt(i)+"")-1);
                break;
            }
            int now = Integer.parseInt(input.substring(i, i+2));

            if(now > 0 && now < 27) {
                output += (char)('a'+now-1);
                i++;
            } else if(now >= 27){
                output += (char)('a'+Integer.parseInt(input.charAt(i)+"")-1);
            }
        }

        System.out.println(output);
    }
}
