import java.util.Scanner;

public class ki_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        int lower = 0, upper = 0, digit = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) lower++;
            else if (Character.isUpperCase(c)) upper++;
            else if (Character.isDigit(c)) digit++;
        }

        System.out.println("Số ký tự thường: " + lower);
        System.out.println("Số ký tự hoa: " + upper);
        System.out.println("Số ký tự số: " + digit);
    }
}
