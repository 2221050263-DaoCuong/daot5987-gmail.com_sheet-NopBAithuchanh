// Lớp HelloWorld có phương thức để in ra màn hình
public class HelloWorld {
    // Phương thức instance
    public void sayHello() {
        System.out.println("Hello World");
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld(); // Tạo đối tượng
        hw.sayHello();                    // Gọi phương thức
    }
}
