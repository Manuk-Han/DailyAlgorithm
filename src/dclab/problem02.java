package dclab;

import java.io.*;
import java.util.Scanner;

public class problem02 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        String side = "*".repeat(n) + " ".repeat((n-2)*2+1) + "*".repeat(n);

        System.out.println(side);

        for (int i = 1; i < n-1; i++)
            System.out.println(" ".repeat(i) + "*" + " ".repeat(n-2) + "*" + " ".repeat(((n-i-2)*2+1)) + "*" + " ".repeat(n-2) + "*");

        System.out.println(" ".repeat(n-1) + "*" + " ".repeat(n-2) + "*" + " ".repeat(n-2) + "*");

        for (int i = n-2; i > 0; i--)
            System.out.println(" ".repeat(i) + "*" + " ".repeat(n-2) + "*" + " ".repeat(((n-i-2)*2+1)) + "*" + " ".repeat(n-2) + "*");

        System.out.println(side);
    }
}