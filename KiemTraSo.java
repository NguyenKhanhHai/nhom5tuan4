import java.util.Scanner;

public class KiemTraSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        double n = scanner.nextDouble();
        if (n > 0) {
            System.out.println("Số dương");
        } else if (n < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Số bằng 0");
        }

        scanner.close();
    }
}
