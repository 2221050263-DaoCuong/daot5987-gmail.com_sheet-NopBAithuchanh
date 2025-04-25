import java.util.Scanner;

public class trung_binh_cong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / n;
        System.out.println("Trung bình cộng là: " + average);
    }
}
