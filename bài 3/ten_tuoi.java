import java.util.Scanner;

public class ten_tuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    System.out.print("nhập tên ");
    String ten = scanner.nextLine();
    
    System.out.print("nhập nam sinh: ");
    int namsinh = scanner.nextInt();
    
    int tuoi = 2025 - namsinh;
        System.out.print("bạn năm nay " + tuoi);
    
    if(tuoi < 16)
        System.out.print("bạn đang độ tuổi ịt thành niên");
    else if(tuoi >=16 && tuoi < 18)
        System.out.println("bạn đang độ tuổi trưởng thành");
    else if (18<= tuoi )
        System.out.print(" bạn đã già");
    scanner.close();
    
    }
}