// package WhileLoop;

import java.util.Scanner;

public class print1toN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i += 1;
        }
    }
}
