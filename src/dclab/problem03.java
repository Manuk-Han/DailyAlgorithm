package dclab;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class problem03 {
    static int problemNum = 5;
    static String inFileName = problemNum + ".in";
    static String outFileName = problemNum + ".out";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(), output = "";

        try {
            File inFile = new File("src/dclab/problem03/in/" + inFileName);
            File outFile = new File("src/dclab/problem03/out/" + outFileName);
            FileWriter writer = new FileWriter(inFile);
            writer.write(input);
            writer.close();

            for (int i = 0; i < input.length(); i++) {
                if (i == input.length() - 1) {
                    if(input.charAt(i) == '0') break;

                    output += (char) ('a' + Integer.parseInt(input.charAt(i) + "") - 1);
                    break;
                }
                int now = Integer.parseInt(input.substring(i, i + 2));

                if (now > 0 && now < 27) {
                    output += (char) ('a' + now - 1);
                    i++;
                } else if (now >= 27) {
                    output += (char) ('a' + Integer.parseInt(input.charAt(i) + "") - 1);
                }
            }

            writer = new FileWriter(outFile);
            writer.write(output);
            writer.close();

            System.out.println(output);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
