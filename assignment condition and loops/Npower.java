import java.security.Principal;
import java.util.Scanner;

public class Npower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = s.nextInt();
        System.out.print("Enter n: ");
        int n = s.nextInt();
        s.close();
        int power = x;
        if (x == 0 || n == 0) {
            System.err.print(1);
        } else {
            for (int i = 1; i <= n - 1; i++) {
                power = power * x;
                // System.out.println(power);
            }
            System.err.print(power);
        }

    }
}
