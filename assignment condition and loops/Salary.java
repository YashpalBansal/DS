import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        float basic = 0;
        char grade = 'E';
        while (a == 0) {
            System.out.print("Enter Basic Salary between 0 and 7,500,000: ");
            basic = s.nextInt();
            if (basic >= 0 && basic <= 7500000) {
                a = 1;
            }
            System.out.print("Enter Grade: ");
            grade = s.next().charAt(0);
        }
        // totalSalary = basic + hra + da + allow – pf
        // hra = 20% of basic
        // da = 50% of basic
        // allow = 1700 if grade = ‘A’
        // allow = 1500 if grade = ‘B’
        // allow = 1300 if grade = ‘C' or any other character
        // pf = 11% of basic.
        float hra = (float) (basic * 0.2);
        float da = (float) (basic * 0.5);
        float allow = (float) 0.0;
        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }
        float pf = (float) (basic * 0.11);
        float totalSalary = basic + hra + da + allow - pf;
        System.out.println(totalSalary);
        if (totalSalary - (int) (totalSalary) > 0.5) {
            System.out.println((int) totalSalary + 1);
        } else {
            System.out.println((int) totalSalary);
        }
        s.close();
    }
}
