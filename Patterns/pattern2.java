import java.util.Scanner;

// package Patterns;

public class pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("  ");
                } else {
                    System.out.print(val + " ");
                    val += 1;
                }

            }
            System.out.println();
        }

    }
}
