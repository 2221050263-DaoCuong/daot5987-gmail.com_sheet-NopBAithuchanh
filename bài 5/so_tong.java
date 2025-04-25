import java.util.Scanner;

    public class so_tong {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
        int tong = 0;
        while(tong <= 100 ){
        System.out.print("nhập một số nguyên");
            int so = scanner.nextInt();
            
        tong += so;
        
        if (tong > 100)
        break;
        
    } 
        System.out.print("tổng các số đã nhập là "+ tong);
        
}
}