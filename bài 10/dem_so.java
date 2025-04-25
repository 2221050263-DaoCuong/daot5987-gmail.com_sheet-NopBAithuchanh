import java.util.Scanner;

public class dem_so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi (tối đa 80 ký tự): ");
        String str = scanner.nextLine();

        System.out.print("Nhập ký tự cần đếm: ");
        char ch = scanner.next().charAt(0);

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }

        System.out.println("Số lần xuất hiện của '" + ch + "': " + count);
    }
}
