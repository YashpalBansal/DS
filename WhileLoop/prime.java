// package WhileLoop;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) {
                System.out.println("Not Prime Number");
                break;
            } else if (i == n / 2) {
                System.out.println("Prime Number");
            }
            i += 1;
        }
        s.close();
    }
}
