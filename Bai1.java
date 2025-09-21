import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("Số dương");
        } else if (number < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Số bằng 0");
        }

        scanner.close();
    }
}
