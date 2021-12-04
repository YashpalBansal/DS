package if_else;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class LargetOfThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter variable 1: ");
        int x = s.nextInt();
        System.out.println("Enter variable 2: ");
        int y = s.nextInt();
        System.out.println("Enter variable 3: ");
        int z = s.nextInt();
        s.close();
        if (x > y) {
            if (x > z) {
                System.out.println(x + " is Largest");
            } else {
                System.out.println(z + " is Largest");
            }
        } else {
            if (y > z) {
                System.out.println(y + " is Largest");
            } else {
                System.out.println(z + " is Largest");
            }
        }
    }
}
