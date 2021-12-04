import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int odd_sum = 0;
        int even_sum = 0;
        int i = 0;
        while (n > 0) {
            i += 1;
            int rem = n % 10;
            n = n / 10;
            // System.out.println(n);
            if (i % 2 == 0) {
                odd_sum = odd_sum + rem;
                // System.out.println(odd_sum);
            } else {
                // System.out.println(even_sum);
                even_sum = even_sum + rem;
            }
        }
        System.out.println(even_sum + " " + odd_sum);
    }
}
