import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double a = sc.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double b = sc.nextDouble();
        System.out.println("Chọn phép tính: ");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        int choice = sc.nextInt();
        double result;
        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Kết quả: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Kết quả: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Kết quả: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Kết quả: " + result);
                } else {
                    System.out.println("Không thể chia cho 0!");
                }
                break;
            default:
                System.out.println("Lua chọn không hợp lệ!");
        }
    }
}