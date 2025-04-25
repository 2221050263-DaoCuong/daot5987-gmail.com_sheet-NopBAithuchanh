import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        long factorial = 1;

        do {
            System.out.print("Nhập số nguyên dương: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= n);

        System.out.println("Giai thừa của " + n + " là: " + factorial);
    }
}
